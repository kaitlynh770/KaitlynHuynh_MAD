//
//  ViewController.swift
//  lab3
//
//  Created by Kaitlyn Huynh on 9/16/21.
//

import UIKit

class ViewController: UIViewController {
    @IBOutlet weak var breakfast: UIImageView!
    
    @IBOutlet weak var titleLabel: UILabel!
    
    @IBOutlet weak var breakfastText: UILabel!
    
    @IBOutlet weak var imageControl: UISegmentedControl!
    
    @IBOutlet weak var colorControl: UISwitch!
    
    @IBOutlet weak var sizeControl: UISlider!
    
    @IBOutlet weak var fontSizeLabel: UILabel!
    
    @IBOutlet weak var textColorLabel: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        breakfast.loadGif(name: "croissant");
        // Do any additional setup after loading the view.
    }
    func updateImage(){
        if imageControl.selectedSegmentIndex == 0{
            breakfastText.text = "Stop, I could've dropped my croissant!"
            breakfast.loadGif(name: "croissant")
        }
        else if imageControl.selectedSegmentIndex == 1{
            breakfastText.text = "Oui oui baguette!"
            breakfast.loadGif(name: "baguette")
        }
        else if imageControl.selectedSegmentIndex == 2{
            breakfastText.text = "The most important meal of the day, serving it up Gary's way!"
            breakfast.loadGif(name: "sandwich")
        }

    }
    func updateColor(){
        if colorControl.isOn{
            breakfastText.textColor = UIColor.white
            titleLabel.textColor = UIColor.white
            fontSizeLabel.textColor = UIColor.white
            textColorLabel.textColor = UIColor.white
            self.view.backgroundColor = #colorLiteral(red: 0.9764705882, green: 0.862745098, blue: 0.8, alpha: 1)
        }
        else{
            breakfastText.textColor = UIColor.black
            titleLabel.textColor = UIColor.black
            fontSizeLabel.textColor = UIColor.black
            textColorLabel.textColor = UIColor.black
            self.view.backgroundColor = #colorLiteral(red: 0.8823529412, green: 0.8784313725, blue: 0.8274509804, alpha: 1)
        }
    }
    func updateCaps(){
        if colorControl.isOn{
            titleLabel.text = titleLabel.text?.uppercased()
            breakfastText.text = breakfastText.text?.uppercased()
        }
        else{
            titleLabel.text = titleLabel.text?.lowercased()
            breakfastText.text = breakfastText.text?.lowercased()
        }
    }
    @IBAction func changeFontSize(_ sender: UISlider) {
        let fontSize = sender.value
        //format is telling it to have no decimal places
        fontSizeLabel.text = String(format: "%.0f", fontSize)
        let fontSizeCGFloat = CGFloat(fontSize)
        breakfastText.font = UIFont.systemFont(ofSize: fontSizeCGFloat)
    }
    @IBAction func changeInfo(_ sender: UISegmentedControl) {
        updateImage()
    }
    
    @IBAction func updateFontColor(_ sender: UISwitch) {
        updateColor()
        updateCaps()
    }
}
