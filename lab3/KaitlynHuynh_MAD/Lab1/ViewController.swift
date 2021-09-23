//
//  ViewController.swift
//  Lab1
//
//  Created by Kaitlyn Huynh on 8/31/21.
//

import UIKit

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        aboutMeImage.loadGif(name: "heart-love");
        // Do any additional setup after loading the view.
    }
    
    @IBAction func favoriteButton(_ sender: UIButton) {
        if sender.tag == 1{
            aboutMeText.text = "My favorite fruits are strawberries!";
            aboutMeImage.loadGif(name: "strawberries")
        }
        if sender.tag == 2{
            aboutMeText.text = "My favorite season is Spring!";
            aboutMeImage.loadGif(name: "flower-spring")
        }
    }
    @IBOutlet weak var aboutMeText: UILabel!
    @IBOutlet weak var aboutMeImage: UIImageView!
}

