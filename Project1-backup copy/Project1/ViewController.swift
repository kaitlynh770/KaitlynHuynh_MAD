//
//  ViewController.swift
//  Project1
//
//  Created by Kaitlyn Huynh on 10/3/21.
//

import UIKit
import AVFoundation


class ViewController: UIViewController {
    
    /*
        Source used for audio code
        https://www.youtube.com/watch?v=1htq-c4kVdA
    */
    
    var hutaoSelected = false;
    var childeSelected = false;
    var ganyuSelected = false;
    var chongyunSelected = false;
    var keqingSelected = false;
    var yanfeiSelected = false;
    var kazuhaSelected = false;
    var zhongliSelected = false;
    
    @IBOutlet weak var intro: UILabel!
    @IBOutlet weak var characterDescription: UILabel!
    @IBOutlet weak var huTaoButtonImage: UIButton!
    @IBOutlet weak var keqingButtonImage: UIButton!
    @IBOutlet weak var ganyuButtonImage: UIButton!
    @IBOutlet weak var yanfeiButtonImage: UIButton!
    @IBOutlet weak var zhongliButtonImage: UIButton!
    @IBOutlet weak var childeButtonImage: UIButton!
    @IBOutlet weak var kazuhaButtonImage: UIButton!
    @IBOutlet weak var chongyunButtonImage: UIButton!
    @IBOutlet weak var button1: UIButton!
    @IBOutlet weak var button2: UIButton!
    @IBOutlet weak var button3: UIButton!
    @IBOutlet weak var button4: UIButton!
    
    var audioPlayer: AVAudioPlayer?
    
    @IBOutlet weak var characterPortrait: UIImageView!
    
    @IBOutlet weak var languageControl: UISegmentedControl!
    
    func selectButton1(){
        button1.setImage(UIImage(named: "1-button-selected"), for: .normal)
    }
    func deselectButton1(){
        button1.setImage(UIImage(named: "1-button"), for: .normal)
    }
    func selectButton2(){
        button2.setImage(UIImage(named: "2-button-selected"), for: .normal)
    }
    func deselectButton2(){
        button2.setImage(UIImage(named: "2-button"), for: .normal)
    }
    func selectButton3(){
        button3.setImage(UIImage(named: "3-button-selected"), for: .normal)
    }
    func deselectButton3(){
        button3.setImage(UIImage(named: "3-button"), for: .normal)
    }
    func selectButton4(){
        button4.setImage(UIImage(named: "4-button-selected"), for: .normal)
    }
    func deselectButton4(){
        button4.setImage(UIImage(named: "4-button"), for: .normal)
    }
    func selectHuTao(){
        huTaoButtonImage.setImage(UIImage(named: "hu-tao-selected"), for: .normal)
    }
    func deselectHuTao(){
        huTaoButtonImage.setImage(UIImage(named: "hu-tao-regular"), for: .normal)
    }
    func selectGanyu(){
        ganyuButtonImage.setImage(UIImage(named: "ganyu-selected"), for: .normal)
    }
    func deselectGanyu(){
        ganyuButtonImage.setImage(UIImage(named: "ganyu-regular"), for: .normal)
    }
    func selectKeqing(){
        keqingButtonImage.setImage(UIImage(named: "keqing-selected"), for: .normal)
    }
    func deselectKeqing(){
        keqingButtonImage.setImage(UIImage(named: "keqing-regular"), for: .normal)
    }
    func selectYanfei(){
        yanfeiButtonImage.setImage(UIImage(named: "yanfei-selected"), for: .normal)
    }
    func deselectYanfei(){
        yanfeiButtonImage.setImage(UIImage(named: "yanfei-regular"), for: .normal)
    }
    func selectZhongli(){
        zhongliButtonImage.setImage(UIImage(named: "zhongli-selected"), for: .normal)
    }
    func deselectZhongli(){
        zhongliButtonImage.setImage(UIImage(named: "zhongli-regular"), for: .normal)
    }
    func selectChilde(){
        childeButtonImage.setImage(UIImage(named: "childe-selected"), for: .normal)
    }
    func deselectChilde(){
        childeButtonImage.setImage(UIImage(named: "childe-regular"), for: .normal)
    }
    func selectKazuha(){
        kazuhaButtonImage.setImage(UIImage(named: "kazuha-selected"), for: .normal)
    }
    func deselectKazuha(){
        kazuhaButtonImage.setImage(UIImage(named: "kazuha-regular"), for: .normal)
    }
    func selectChongyun(){
        chongyunButtonImage.setImage(UIImage(named: "chongyun-selected"), for: .normal)
    }
    func deselectChongyun(){
        chongyunButtonImage.setImage(UIImage(named: "chongyun-regular"), for: .normal)
    }
    
    @IBAction func voiceline1(_ sender: UIButton) {
        selectButton1()
        deselectButton2()
        deselectButton3()
        deselectButton4()
        if hutaoSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let huTaoChinese1 = Bundle.main.path(forResource: "hu-tao-intro-cn", ofType: "wav")!
                let url = URL(fileURLWithPath: huTaoChinese1)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    //do nothing
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let huTaoJapanese1 = Bundle.main.path(forResource: "hu-tao-intro-jp", ofType: "wav")!
                let url = URL(fileURLWithPath: huTaoJapanese1)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    //do nothing
                }
            }
            else if languageControl.selectedSegmentIndex == 2{
                let huTaoEnglish1 = Bundle.main.path(forResource: "hu-tao-intro-en", ofType: "wav")!
                let url = URL(fileURLWithPath: huTaoEnglish1)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    //do nothing
                }
            }
        }
        if ganyuSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let ganyuChinese1 = Bundle.main.path(forResource: "introductionganyu-chinese", ofType: "wav")!
                let url = URL(fileURLWithPath: ganyuChinese1)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    //do nothing
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let ganyuJapanese1 = Bundle.main.path(forResource: "introductionganyu-japanese", ofType: "wav")!
                let url = URL(fileURLWithPath: ganyuJapanese1)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    //do nothing
                }
            }
            else if languageControl.selectedSegmentIndex == 2{
                let ganyuEnglish1 = Bundle.main.path(forResource: "introduction-ganyu-english", ofType: "wav")!
                let url = URL(fileURLWithPath: ganyuEnglish1)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    //do nothing
                }
            }
        }
        if keqingSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let keqingChinese1 = Bundle.main.path(forResource: "keqing-intro-cn", ofType: "wav")!
                let url = URL(fileURLWithPath: keqingChinese1)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let keqingJapanese1 = Bundle.main.path(forResource: "keqing-intro-jp", ofType: "wav")!
                let url = URL(fileURLWithPath: keqingJapanese1)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 2{
                let keqingEnglish1 = Bundle.main.path(forResource: "keqing-intro-en", ofType: "wav")!
                let url = URL(fileURLWithPath: keqingEnglish1)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
        }
        if yanfeiSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let yanfeiChinese1 = Bundle.main.path(forResource: "yanfei-intro-cn", ofType: "wav")!
                let url = URL(fileURLWithPath: yanfeiChinese1)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let yanfeiJapanese1 = Bundle.main.path(forResource: "yanfei-intro-jp", ofType: "wav")!
                let url = URL(fileURLWithPath: yanfeiJapanese1)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
                
            }
            else if languageControl.selectedSegmentIndex == 2{
                let yanfeiEnglish1 = Bundle.main.path(forResource: "yanfei-intro-en", ofType: "wav")!
                let url = URL(fileURLWithPath: yanfeiEnglish1)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
                
            }
        }
        if zhongliSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let zhongliChinese1 = Bundle.main.path(forResource: "zhongli-intro-cn", ofType: "wav")!
                let url = URL(fileURLWithPath: zhongliChinese1)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let zhongliJapanese1 = Bundle.main.path(forResource: "zhongli-intro-jp", ofType: "wav")!
                let url = URL(fileURLWithPath: zhongliJapanese1)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 2{
                let zhongliEnglish1 = Bundle.main.path(forResource: "zhongli-intro-en", ofType: "wav")!
                let url = URL(fileURLWithPath: zhongliEnglish1)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
        }
        if childeSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let childeChinese1 = Bundle.main.path(forResource: "childe-intro-cn", ofType: "wav")!
                let url = URL(fileURLWithPath: childeChinese1)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let childeJapanese1 = Bundle.main.path(forResource: "childe-intro-jp", ofType: "wav")!
                let url = URL(fileURLWithPath: childeJapanese1)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 2{
                let childeEnglish1 = Bundle.main.path(forResource: "childe-intro-en", ofType: "wav")!
                let url = URL(fileURLWithPath: childeEnglish1)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
        }
        if kazuhaSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let kazuhaChinese1 = Bundle.main.path(forResource: "kazuha-intro-cn", ofType: "wav")!
                let url = URL(fileURLWithPath: kazuhaChinese1)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let kazuhaJapanese1 = Bundle.main.path(forResource: "kazuha-intro-jp", ofType: "wav")!
                let url = URL(fileURLWithPath: kazuhaJapanese1)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 2{
                let kazuhaEnglish1 = Bundle.main.path(forResource: "kazuha-intro-en", ofType: "wav")!
                let url = URL(fileURLWithPath: kazuhaEnglish1)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
        }
        if chongyunSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let chongyunChinese1 = Bundle.main.path(forResource: "chongyun-intro-cn", ofType: "wav")!
                let url = URL(fileURLWithPath: chongyunChinese1)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let chongyunJapanese1 = Bundle.main.path(forResource: "chongyun-intro-jp", ofType: "wav")!
                let url = URL(fileURLWithPath: chongyunJapanese1)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 2{
                let chongyunEnglish1 = Bundle.main.path(forResource: "chongyun-intro-en", ofType: "wav")!
                let url = URL(fileURLWithPath: chongyunEnglish1)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
        }
    }
    @IBAction func voiceline2(_ sender: UIButton) {
        selectButton2()
        deselectButton1()
        deselectButton3()
        deselectButton4()
        if hutaoSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let huTaoChinese2 = Bundle.main.path(forResource: "hu-tao-hill-cn", ofType: "wav")!
                let url = URL(fileURLWithPath: huTaoChinese2)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    //do nothing
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let huTaoJapanese2 = Bundle.main.path(forResource: "hu-tao-hill-jp", ofType: "wav")!
                let url = URL(fileURLWithPath: huTaoJapanese2)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    //do nothing
                }
            }
            else if languageControl.selectedSegmentIndex == 2{
                let huTaoEnglish2 = Bundle.main.path(forResource: "hu-tao-hill-en", ofType: "wav")!
                let url = URL(fileURLWithPath: huTaoEnglish2)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    //do nothing
                }
            }
        }
        if ganyuSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let ganyuChinese2 = Bundle.main.path(forResource: "ganyu-work-cn", ofType: "wav")!
                let url = URL(fileURLWithPath: ganyuChinese2)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let ganyuJapanese2 = Bundle.main.path(forResource: "ganyu-work-jp", ofType: "wav")!
                let url = URL(fileURLWithPath: ganyuJapanese2)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 2{
                let ganyuEnglish2 = Bundle.main.path(forResource: "ganyu-work-en", ofType: "wav")!
                let url = URL(fileURLWithPath: ganyuEnglish2)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
        }
        if keqingSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let keqingChinese2 = Bundle.main.path(forResource: "keqing-proc-cn", ofType: "wav")!
                let url = URL(fileURLWithPath: keqingChinese2)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let keqingJapanese2 = Bundle.main.path(forResource: "keqing-proc-jp", ofType: "wav")!
                let url = URL(fileURLWithPath: keqingJapanese2)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 2{
                let keqingEnglish2 = Bundle.main.path(forResource: "keqing-proc-en", ofType: "wav")!
                let url = URL(fileURLWithPath: keqingEnglish2)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
        }
        if yanfeiSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let yanfeiChinese2 = Bundle.main.path(forResource: "yanfei-law-cn", ofType: "wav")!
                let url = URL(fileURLWithPath: yanfeiChinese2)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let yanfeiJapanese2 = Bundle.main.path(forResource: "yanfei-law-jp", ofType: "wav")!
                let url = URL(fileURLWithPath: yanfeiJapanese2)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
                
            }
            else if languageControl.selectedSegmentIndex == 2{
                let yanfeiEnglish2 = Bundle.main.path(forResource: "yanfei-law-en", ofType: "wav")!
                let url = URL(fileURLWithPath: yanfeiEnglish2)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
                
            }
        }
        if zhongliSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let zhongliChinese2 = Bundle.main.path(forResource: "zhongli-tour-cn", ofType: "wav")!
                let url = URL(fileURLWithPath: zhongliChinese2)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let zhongliJapanese2 = Bundle.main.path(forResource: "zhongli-tour-jp", ofType: "wav")!
                let url = URL(fileURLWithPath: zhongliJapanese2)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 2{
                let zhongliEnglish2 = Bundle.main.path(forResource: "zhongli-tour-en", ofType: "wav")!
                let url = URL(fileURLWithPath: zhongliEnglish2)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
        }
        if childeSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let childeChinese2 = Bundle.main.path(forResource: "childe-fish-cn", ofType: "wav")!
                let url = URL(fileURLWithPath: childeChinese2)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let childeJapanese2 = Bundle.main.path(forResource: "childe-fish-jp", ofType: "wav")!
                let url = URL(fileURLWithPath: childeJapanese2)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 2{
                let childeEnglish2 = Bundle.main.path(forResource: "childe-fish-en", ofType: "wav")!
                let url = URL(fileURLWithPath: childeEnglish2)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
        }
        if kazuhaSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let kazuhaChinese2 = Bundle.main.path(forResource: "kazuha-about-cn", ofType: "wav")!
                let url = URL(fileURLWithPath: kazuhaChinese2)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let kazuhaJapanese2 = Bundle.main.path(forResource: "kazuha-about-jp", ofType: "wav")!
                let url = URL(fileURLWithPath: kazuhaJapanese2)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 2{
                let kazuhaEnglish2 = Bundle.main.path(forResource: "kazuha-about-en", ofType: "wav")!
                let url = URL(fileURLWithPath: kazuhaEnglish2)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
        }
        if chongyunSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let chongyunChinese2 = Bundle.main.path(forResource: "chongyun-diet-cn", ofType: "wav")!
                let url = URL(fileURLWithPath: chongyunChinese2)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let chongyunJapanese2 = Bundle.main.path(forResource: "chongyun-diet-jp", ofType: "wav")!
                let url = URL(fileURLWithPath: chongyunJapanese2)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 2{
                let chongyunEnglish2 = Bundle.main.path(forResource: "chongyun-diet-en", ofType: "wav")!
                let url = URL(fileURLWithPath: chongyunEnglish2)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
        }
    }
    @IBAction func voiceline3(_ sender: UIButton) {
        selectButton3()
        deselectButton1()
        deselectButton4()
        deselectButton2()
        if hutaoSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let huTaoChinese3 = Bundle.main.path(forResource: "hu-tao-name-cn", ofType: "wav")!
                let url = URL(fileURLWithPath: huTaoChinese3)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    //do nothing
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let huTaoJapanese3 = Bundle.main.path(forResource: "hu-tao-name-jp", ofType: "wav")!
                let url = URL(fileURLWithPath: huTaoJapanese3)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    //do nothing
                }
            }
            else if languageControl.selectedSegmentIndex == 2{
                let huTaoEnglish3 = Bundle.main.path(forResource: "hu-tao-name-en", ofType: "wav")!
                let url = URL(fileURLWithPath: huTaoEnglish3)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    //do nothing
                }
            }
        }
        if ganyuSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let ganyuChinese3 = Bundle.main.path(forResource: "ganyu-rain-cn", ofType: "wav")!
                let url = URL(fileURLWithPath: ganyuChinese3)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let ganyuJapanese3 = Bundle.main.path(forResource: "ganyu-rain-jp", ofType: "wav")!
                let url = URL(fileURLWithPath: ganyuJapanese3)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 2{
                let ganyuEnglish3 = Bundle.main.path(forResource: "ganyu-rain-en", ofType: "wav")!
                let url = URL(fileURLWithPath: ganyuEnglish3)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
        }
        if keqingSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let keqingChinese3 = Bundle.main.path(forResource: "keqing-sun-cn", ofType: "wav")!
                let url = URL(fileURLWithPath: keqingChinese3)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let keqingJapanese3 = Bundle.main.path(forResource: "keqing-sun-jp", ofType: "wav")!
                let url = URL(fileURLWithPath: keqingJapanese3)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 2{
                let keqingEnglish3 = Bundle.main.path(forResource: "keqing-sun-en", ofType: "wav")!
                let url = URL(fileURLWithPath: keqingEnglish3)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
        }
        if yanfeiSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let yanfeiChinese3 = Bundle.main.path(forResource: "yanfei-tofu-cn", ofType: "wav")!
                let url = URL(fileURLWithPath: yanfeiChinese3)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let yanfeiJapanese3 = Bundle.main.path(forResource: "yanfei-tofu-jp", ofType: "wav")!
                let url = URL(fileURLWithPath: yanfeiJapanese3)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
                
            }
            else if languageControl.selectedSegmentIndex == 2{
                let yanfeiEnglish3 = Bundle.main.path(forResource: "yanfei-tofu-en", ofType: "wav")!
                let url = URL(fileURLWithPath: yanfeiEnglish3)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
                
            }
        }
        if zhongliSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let zhongliChinese3 = Bundle.main.path(forResource: "zhongli-wine-cn", ofType: "wav")!
                let url = URL(fileURLWithPath: zhongliChinese3)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let zhongliJapanese3 = Bundle.main.path(forResource: "zhongli-wine-jp", ofType: "wav")!
                let url = URL(fileURLWithPath: zhongliJapanese3)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 2{
                let zhongliEnglish3 = Bundle.main.path(forResource: "zhongli-wine-en", ofType: "wav")!
                let url = URL(fileURLWithPath: zhongliEnglish3)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
        }
        if childeSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let childeChinese3 = Bundle.main.path(forResource: "childe-idle-cn", ofType: "wav")!
                let url = URL(fileURLWithPath: childeChinese3)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let childeJapanese3 = Bundle.main.path(forResource: "childe-idle-jp", ofType: "wav")!
                let url = URL(fileURLWithPath: childeJapanese3)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 2{
                let childeEnglish3 = Bundle.main.path(forResource: "childe-idle-en", ofType: "wav")!
                let url = URL(fileURLWithPath: childeEnglish3)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
        }
        if kazuhaSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let kazuhaChinese3 = Bundle.main.path(forResource: "kazuha-maple-cn", ofType: "wav")!
                let url = URL(fileURLWithPath: kazuhaChinese3)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let kazuhaJapanese3 = Bundle.main.path(forResource: "kazuha-maple-jp", ofType: "wav")!
                let url = URL(fileURLWithPath: kazuhaJapanese3)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 2{
                let kazuhaEnglish3 = Bundle.main.path(forResource: "kazuha-maple-en", ofType: "wav")!
                let url = URL(fileURLWithPath: kazuhaEnglish3)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
        }
        if chongyunSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let chongyunChinese3 = Bundle.main.path(forResource: "chongyun-spicy-cn", ofType: "wav")!
                let url = URL(fileURLWithPath: chongyunChinese3)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let chongyunJapanese3 = Bundle.main.path(forResource: "chongyun-spicy-jp", ofType: "wav")!
                let url = URL(fileURLWithPath: chongyunJapanese3)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 2{
                let chongyunEnglish3 = Bundle.main.path(forResource: "chongyun-spicy-en", ofType: "wav")!
                let url = URL(fileURLWithPath: chongyunEnglish3)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
        }
    }
    
    @IBAction func voiceline4(_ sender: UIButton) {
        selectButton4()
        deselectButton1()
        deselectButton2()
        deselectButton3()
        if hutaoSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let huTaoChinese4 = Bundle.main.path(forResource: "hu-tao-night-cn", ofType: "wav")!
                let url = URL(fileURLWithPath: huTaoChinese4)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    //do nothing
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let huTaoJapanese4 = Bundle.main.path(forResource: "hu-tao-night-jp", ofType: "wav")!
                let url = URL(fileURLWithPath: huTaoJapanese4)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    //do nothing
                }
            }
            else if languageControl.selectedSegmentIndex == 2{
                let huTaoEnglish4 = Bundle.main.path(forResource: "hu-tao-night-en", ofType: "wav")!
                let url = URL(fileURLWithPath: huTaoEnglish4)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    //do nothing
                }
            }
        }
        if ganyuSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let ganyuChinese4 = Bundle.main.path(forResource: "ganyu-qingxin-cn", ofType: "wav")!
                let url = URL(fileURLWithPath: ganyuChinese4)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let ganyuJapanese4 = Bundle.main.path(forResource: "ganyu-qingxin-jp", ofType: "wav")!
                let url = URL(fileURLWithPath: ganyuJapanese4)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 2{
                let ganyuEnglish4 = Bundle.main.path(forResource: "ganyu-qingxin-en", ofType: "wav")!
                let url = URL(fileURLWithPath: ganyuEnglish4)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
        }
        if keqingSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let keqingChinese4 = Bundle.main.path(forResource: "keqing-shopping-cn", ofType: "wav")!
                let url = URL(fileURLWithPath: keqingChinese4)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let keqingJapanese4 = Bundle.main.path(forResource: "keqing-shopping-jp", ofType: "wav")!
                let url = URL(fileURLWithPath: keqingJapanese4)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 2{
                let keqingEnglish4 = Bundle.main.path(forResource: "keqing-shopping-en", ofType: "wav")!
                let url = URL(fileURLWithPath: keqingEnglish4)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
        }
        if yanfeiSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let yanfeiChinese4 = Bundle.main.path(forResource: "yanfei-rain-cn", ofType: "wav")!
                let url = URL(fileURLWithPath: yanfeiChinese4)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let yanfeiJapanese4 = Bundle.main.path(forResource: "yanfei-rain-jp", ofType: "wav")!
                let url = URL(fileURLWithPath: yanfeiJapanese4)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
                
            }
            else if languageControl.selectedSegmentIndex == 2{
                let yanfeiEnglish4 = Bundle.main.path(forResource: "yanfei-rain-en", ofType: "wav")!
                let url = URL(fileURLWithPath: yanfeiEnglish4)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
                
            }
        }
        if zhongliSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let zhongliChinese4 = Bundle.main.path(forResource: "zhongli-seafood-cn", ofType: "wav")!
                let url = URL(fileURLWithPath: zhongliChinese4)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let zhongliJapanese4 = Bundle.main.path(forResource: "zhongli-seafood-jp", ofType: "wav")!
                let url = URL(fileURLWithPath: zhongliJapanese4)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 2{
                let zhongliEnglish4 = Bundle.main.path(forResource: "zhongli-seafood-en", ofType: "wav")!
                let url = URL(fileURLWithPath: zhongliEnglish4)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
        }
        if childeSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let childeChinese4 = Bundle.main.path(forResource: "childe-home-cn", ofType: "wav")!
                let url = URL(fileURLWithPath: childeChinese4)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let childeJapanese4 = Bundle.main.path(forResource: "childe-home-jp", ofType: "wav")!
                let url = URL(fileURLWithPath: childeJapanese4)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 2{
                let childeEnglish4 = Bundle.main.path(forResource: "childe-home-en", ofType: "wav")!
                let url = URL(fileURLWithPath: childeEnglish4)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
        }
        if kazuhaSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let kazuhaChinese4 = Bundle.main.path(forResource: "kazuha-rock-cn", ofType: "wav")!
                let url = URL(fileURLWithPath: kazuhaChinese4)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let kazuhaJapanese4 = Bundle.main.path(forResource: "kazuha-rock-jp", ofType: "wav")!
                let url = URL(fileURLWithPath: kazuhaJapanese4)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 2{
                let kazuhaEnglish4 = Bundle.main.path(forResource: "kazuha-rock-en", ofType: "wav")!
                let url = URL(fileURLWithPath: kazuhaEnglish4)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
        }
        if chongyunSelected == true{
            if languageControl.selectedSegmentIndex == 0{
                let chongyunChinese4 = Bundle.main.path(forResource: "chongyun-tea-cn", ofType: "wav")!
                let url = URL(fileURLWithPath: chongyunChinese4)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 1{
                let chongyunJapanese4 = Bundle.main.path(forResource: "chongyun-tea-jp", ofType: "wav")!
                let url = URL(fileURLWithPath: chongyunJapanese4)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
            else if languageControl.selectedSegmentIndex == 2{
                let chongyunEnglish4 = Bundle.main.path(forResource: "chongyun-tea-en", ofType: "wav")!
                let url = URL(fileURLWithPath: chongyunEnglish4)
                do{
                    audioPlayer = try AVAudioPlayer(contentsOf: url)
                    audioPlayer?.play()
                }
                catch{
                    
                }
            }
        }
    }
    
    @IBAction func huTaoButton(_ sender: UIButton) {
        hutaoSelected = true;
        if(hutaoSelected == true){
            selectHuTao()
            deselectGanyu()
            deselectKeqing()
            deselectYanfei()
            deselectZhongli()
            deselectChilde()
            deselectKazuha()
            deselectChongyun()
            deselectButton1()
            deselectButton2()
            deselectButton3()
            deselectButton4()
            keqingSelected = false
            ganyuSelected = false
            yanfeiSelected = false
            zhongliSelected = false
            chongyunSelected = false
            kazuhaSelected = false
            childeSelected = false
            characterPortrait.isHidden = false
            intro.text = "Hu Tao"
            characterPortrait.image = UIImage(named: "hu-tao-portrait")
            characterDescription.text = "Hu Tao is the 77th Director of the Wangsheng Funeral Parlor, a person vital to managing Liyue's funerary affairs. She does her utmost to flawlessly carry out a person's last rites and preserve the world's balance of yin and yang. Aside from this, she is also a talented poet whose many 'masterpieces' have passed around Liyue's populace by word of mouth."
        }
        else if (hutaoSelected == false){
            deselectHuTao()
        }
    }
    @IBAction func ganyuButton(_ sender: UIButton) {
        ganyuSelected = true;
        if(ganyuSelected == true){
            selectGanyu()
            deselectHuTao()
            deselectKeqing()
            deselectYanfei()
            deselectZhongli()
            deselectChilde()
            deselectKazuha()
            deselectChongyun()
            deselectButton1()
            deselectButton2()
            deselectButton3()
            deselectButton4()
            keqingSelected = false
            hutaoSelected = false
            yanfeiSelected = false
            zhongliSelected = false
            chongyunSelected = false
            kazuhaSelected = false
            childeSelected = false
            characterPortrait.isHidden = false
            intro.text = "Ganyu"
            characterPortrait.image = UIImage(named: "ganyu-portrait")
            characterDescription.text = "The secretary to the Liyue Qixing. The blood of both human and illuminated beast flows within her veins. Graceful and quiet by nature, yet the gentle disposition of qilin sees not even the slightest conflict with even the most arduous of workloads. After all, Ganyu firmly believes that all the work she does is in honor of her contract with Rex Lapis, seeking the well-being of all living things within Liyue."
        }
        else if (ganyuSelected==false){
            deselectGanyu()
        }
    }
    
    @IBAction func keqingButton(_ sender: UIButton) {
        keqingSelected = true;
        if(keqingSelected == true){
            selectKeqing()
            deselectHuTao()
            deselectGanyu()
            deselectYanfei()
            deselectZhongli()
            deselectChilde()
            deselectKazuha()
            deselectChongyun()
            deselectButton1()
            deselectButton2()
            deselectButton3()
            deselectButton4()
            ganyuSelected = false
            hutaoSelected = false
            yanfeiSelected = false
            zhongliSelected = false
            chongyunSelected = false
            kazuhaSelected = false
            childeSelected = false
            characterPortrait.isHidden = false
            intro.text = "Keqing"
            characterPortrait.image = UIImage(named: "keqing-portrait")
            characterDescription.text = "The Yuheng of the Liyue Qixing. Keqing has much to say about Rex Lapis' unilateral approach to policymaking in Liyue ⁠— but in truth, gods admire skeptics such as her quite a lot. She firmly believes that humanity's future should be determined by humans themselves, and that they can even do better than the archons and adepti have done for them. In order to prove this, she works harder than anyone else."
        }
        else if (keqingSelected == false){
            deselectKeqing()
        }
    }
    
    @IBAction func yanfeiButton(_ sender: UIButton) {
        yanfeiSelected = true;
        if(yanfeiSelected == true){
            selectYanfei()
            deselectHuTao()
            deselectGanyu()
            deselectKeqing()
            deselectZhongli()
            deselectChilde()
            deselectKazuha()
            deselectChongyun()
            deselectButton1()
            deselectButton2()
            deselectButton3()
            deselectButton4()
            keqingSelected = false
            hutaoSelected = false
            ganyuSelected = false
            zhongliSelected = false
            chongyunSelected = false
            kazuhaSelected = false
            childeSelected = false
            characterPortrait.isHidden = false
            intro.text = "Yanfei"
            characterPortrait.image = UIImage(named: "yanfei-portrait")
            characterDescription.text = "A half-illuminated beast and highly-skilled legal adviser.She combines adherence to the legal codices and reasonable flexibility to find the perfect balance in her work. She devotes herself to protecting the fairness of contracts in Liyue with her identity as a legal adviser and her unique experience and methods."
        }
        else if (yanfeiSelected == false){
            deselectYanfei()
        }
    }
    
    @IBAction func zhongliButton(_ sender: UIButton) {
        zhongliSelected = true;
        if(zhongliSelected == true){
            selectZhongli()
            deselectHuTao()
            deselectGanyu()
            deselectKeqing()
            deselectYanfei()
            deselectChilde()
            deselectKazuha()
            deselectChongyun()
            deselectButton1()
            deselectButton2()
            deselectButton3()
            deselectButton4()
            keqingSelected = false
            hutaoSelected = false
            yanfeiSelected = false
            ganyuSelected = false
            chongyunSelected = false
            kazuhaSelected = false
            childeSelected = false
            characterPortrait.isHidden = false
            intro.text = "Zhongli"
            characterPortrait.image = UIImage(named: "zhongli-portrait")
            characterDescription.text = "Wangsheng Funeral Parlor's mysterious consultant. Handsome, elegant, and surpassingly learned. Though no one knows where Zhongli is from, he is a master of courtesy and rules. From his seat at Wangsheng Funeral Parlor, he performs all manner of rituals."
        }
        else if (zhongliSelected == false){
            deselectZhongli()
        }
    }
    
    @IBAction func childeButton(_ sender: UIButton) {
        childeSelected = true;
        if(childeSelected == true){
            selectChilde()
            deselectHuTao()
            deselectGanyu()
            deselectKeqing()
            deselectYanfei()
            deselectZhongli()
            deselectKazuha()
            deselectChongyun()
            deselectButton1()
            deselectButton2()
            deselectButton3()
            deselectButton4()
            keqingSelected = false
            hutaoSelected = false
            yanfeiSelected = false
            zhongliSelected = false
            chongyunSelected = false
            kazuhaSelected = false
            ganyuSelected = false
            characterPortrait.isHidden = false
            intro.text = "Tartaglia"
            characterPortrait.image = UIImage(named: "childe-portrait")
            characterDescription.text = "Meet Tartaglia — the cunning Snezhnayan whose unpredictable personality keeps people guessing his every move. Don't be under any illusion as to what he might be thinking or what his intentions are. Just remember this: Behind that innocent, childlike exterior lies a finely honed instrument of war."
        }
        else if (childeSelected == false){
            deselectChilde()
        }
    }
    
    @IBAction func kazuhaButton(_ sender: UIButton) {
        kazuhaSelected = true;
        if(kazuhaSelected == true){
            selectKazuha()
            deselectHuTao()
            deselectGanyu()
            deselectKeqing()
            deselectYanfei()
            deselectZhongli()
            deselectChilde()
            deselectChongyun()
            deselectButton1()
            deselectButton2()
            deselectButton3()
            deselectButton4()
            keqingSelected = false
            hutaoSelected = false
            yanfeiSelected = false
            zhongliSelected = false
            chongyunSelected = false
            ganyuSelected = false
            childeSelected = false
            characterPortrait.isHidden = false
            intro.text = "Kazuha"
            characterPortrait.image = UIImage(named: "kazuha-portrait")
            characterDescription.text = "A wandering samurai from Inazuma with a modest and gentle personality. Beneath a youthful and carefree demeanor lies a heart that hides a great many burdens from the past. Seemingly easygoing, Kazuha has his own code of conduct."
        }
        else if (kazuhaSelected == false){
            deselectKazuha()
        }
    }
    
    @IBAction func chongyunButton(_ sender: UIButton) {
        chongyunSelected = true;
        if(chongyunSelected == true){
            selectChongyun()
            deselectHuTao()
            deselectGanyu()
            deselectKeqing()
            deselectYanfei()
            deselectZhongli()
            deselectChilde()
            deselectKazuha()
            deselectButton1()
            deselectButton2()
            deselectButton3()
            deselectButton4()
            keqingSelected = false
            hutaoSelected = false
            yanfeiSelected = false
            zhongliSelected = false
            ganyuSelected = false
            kazuhaSelected = false
            childeSelected = false
            characterPortrait.isHidden = false
            intro.text = "Chongyun"
            characterPortrait.image = UIImage(named: "chongyun-portrait")
            characterDescription.text = "An exorcist who roams the land with Liyue as his base of operations, evil spirits fleeing wherever he goes. As the heir to a clan of exorcists, he has always possessed abilities superior to most. However, these abilities are not the result of training, but of an inborn trait — a pure yang spirit."
        }
        else if (chongyunSelected == false){
            deselectChongyun()
        }
    }
    override func viewDidLoad() {
        super.viewDidLoad()
        characterPortrait.isHidden = true
        // Do any additional setup after loading the view.
    }

}

