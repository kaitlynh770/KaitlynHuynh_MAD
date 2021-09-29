//
//  ViewController.swift
//  Lab4
//
//  Created by Kaitlyn Huynh on 9/28/21.
//

import UIKit

class ViewController: UIViewController, UITextFieldDelegate {

    @IBOutlet weak var cake: UIImageView!
    
    @IBOutlet weak var cakeSlice: UILabel!
    
    @IBOutlet weak var cakeAmount: UITextField!
    
    @IBOutlet weak var peopleNumber: UILabel!
    
    @IBOutlet weak var peopleStepper: UIStepper!
    
    @IBOutlet weak var slicePersonLabel: UILabel!
    
    @IBOutlet weak var slicePerPerson: UILabel!
    
    override func viewDidLoad() {
        
        super.viewDidLoad()
        cake.loadGif(name: "cake")
        self.dismissKeyboard()
        cakeAmount.delegate = self
        // Do any additional setup after loading the view.
    }
    
    func updateSlices(){
        var slices: Float
        if cakeAmount.text!.isEmpty{
            slices = 0.0
        }
        else{
            slices = Float(cakeAmount.text!)!
        }
        let numberOfPeople = peopleStepper.value
        var spp : Float = 0.0
        if numberOfPeople > 0{
            spp = slices / Float(numberOfPeople)
        }
        else{
            let alert = UIAlertController(title: "Warning", message: "The number of people must be greater than 0", preferredStyle: UIAlertController.Style.alert)
            let cancelAction = UIAlertAction(title: "Cancel", style: UIAlertAction.Style.cancel, handler:nil)
            alert.addAction(cancelAction)
            let okAction = UIAlertAction(title:"OK", style: UIAlertAction.Style.default, handler:{action in
                self.peopleStepper.value = 1
                self.peopleNumber.text = "1 person"
                self.updateSlices()
            })
            alert.addAction(okAction)
            present(alert, animated: true, completion: nil)
        }
        spp = slices / Float(numberOfPeople)
        let cakeFormatter = NumberFormatter()
        cakeFormatter.numberStyle = NumberFormatter.Style.decimal
//        slicePerPerson.text = cakeFormatter.string(from: NSNumber(value: spp))
        return slicePerPerson.text = cakeFormatter.string(from: NSNumber(value: spp))
    }
    @IBAction func updatePeople(_ sender: UIStepper) {
        if peopleStepper.value == 1{
            peopleNumber.text = "1 person"
        }
        else{
            peopleNumber.text = String(format: "%.0f", peopleStepper.value) + " people"
        }
        updateSlices()
    }
    func textFieldShouldReturn(_ textField: UITextField) -> Bool {
        textField.resignFirstResponder()
        return true
    }
    func textFieldDidEndEditing(_ textField: UITextField) {
        updateSlices()
    }
}
extension UIViewController {
func dismissKeyboard() {
       let tap: UITapGestureRecognizer = UITapGestureRecognizer( target:     self, action: #selector(UIViewController.dismissKeyboardTouchOutside))
       tap.cancelsTouchesInView = false
       view.addGestureRecognizer(tap)
    }

    @objc private func dismissKeyboardTouchOutside() {
       view.endEditing(true)
    }
}
