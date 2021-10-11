//
//  Artworks.swift
//  Project1
//
//  Created by Kaitlyn Huynh on 10/5/21.
//

import UIKit

class Artworks: UIViewController {
    
    var hutaoSelected = false;
    var childeSelected = false;
    var ganyuSelected = false;
    var chongyunSelected = false;
    var keqingSelected = false;
    var yanfeiSelected = false;
    var kazuhaSelected = false;
    var zhongliSelected = false;
    
    @IBOutlet weak var backButton: UIButton!
    @IBOutlet weak var forwardButton: UIButton!
    var photoCounter = 0;
    
    var huTaoImages: [UIImage] = [
        UIImage(named: "hu-tao-portrait")!,
        UIImage(named: "hu-tao-wish")!,
        UIImage(named: "hu-tao-chibi")!,
    ]
    var ganyuImages: [UIImage] = [
        UIImage(named: "ganyu-portrait")!,
        UIImage(named: "ganyu-wish")!,
        UIImage(named: "ganyu-chibi")!,
    ]
    var keqingImages: [UIImage] = [
        UIImage(named: "keqing-portrait")!,
        UIImage(named: "keqing-wish")!,
        UIImage(named: "keqing-chibi")!,
    ]
    var yanfeiImages: [UIImage] = [
        UIImage(named: "yanfei-portrait")!,
        UIImage(named: "yanfei-wish")!,
        UIImage(named: "yanfei-chibi")!,
    ]
    var zhongliImages: [UIImage] = [
        UIImage(named: "zhongli-portrait")!,
        UIImage(named: "zhongli-wish")!,
        UIImage(named: "zhongli-chibi")!,
    ]
    var childeImages: [UIImage] = [
        UIImage(named: "childe-portrait")!,
        UIImage(named: "childe-wish")!,
        UIImage(named: "childe-chibi")!,
    ]
    var kazuhaImages: [UIImage] = [
        UIImage(named: "kazuha-portrait")!,
        UIImage(named: "kazuha-wish")!,
        UIImage(named: "kazuha-chibi")!,
    ]
    var chongyunImages: [UIImage] = [
        UIImage(named: "chongyun-portrait")!,
        UIImage(named: "chongyun-wish")!,
        UIImage(named: "chongyun-chibi")!,
    ]

    @IBOutlet weak var artworkName: UILabel!
    @IBOutlet weak var characterArtwork: UIImageView!
    @IBOutlet weak var huTaoButtonImage: UIButton!
    @IBOutlet weak var ganyuButtonImage: UIButton!
    @IBOutlet weak var keqingButtonImage: UIButton!
    @IBOutlet weak var yanfeiButtonImage: UIButton!
    @IBOutlet weak var zhongliButtonImage: UIButton!
    @IBOutlet weak var childeButtonImage: UIButton!
    @IBOutlet weak var kazuhaButtonImage: UIButton!
    @IBOutlet weak var chongyunButtonImage: UIButton!
    
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
    
    @IBAction func huTaoButton(_ sender: UIButton) {
        hutaoSelected = true;
        photoCounter = 0;
        forwardButton.isEnabled = true;
        backButton.isEnabled = false;
        artworkName.text = "Character Portrait"
        if(hutaoSelected == true){
            selectHuTao()
            deselectGanyu()
            deselectKeqing()
            deselectYanfei()
            deselectZhongli()
            deselectChilde()
            deselectKazuha()
            deselectChongyun()
            keqingSelected = false
            ganyuSelected = false
            yanfeiSelected = false
            zhongliSelected = false
            chongyunSelected = false
            kazuhaSelected = false
            childeSelected = false
            characterArtwork.image = huTaoImages[0]
        }
        else if (hutaoSelected == false){
            deselectHuTao()
        }
    }
    
    @IBAction func ganyuButton(_ sender: UIButton) {
        ganyuSelected = true;
        photoCounter = 0;
        forwardButton.isEnabled = true;
        backButton.isEnabled = false;
        artworkName.text = "Character Portrait"
        if(ganyuSelected == true){
            selectGanyu()
            deselectHuTao()
            deselectKeqing()
            deselectYanfei()
            deselectZhongli()
            deselectChilde()
            deselectKazuha()
            deselectChongyun()
            keqingSelected = false
            hutaoSelected = false
            yanfeiSelected = false
            zhongliSelected = false
            chongyunSelected = false
            kazuhaSelected = false
            childeSelected = false
            characterArtwork.image = ganyuImages[0]
        }
        else if (ganyuSelected == false){
            deselectGanyu()
        }
    }
    @IBAction func keqingButton(_ sender: UIButton) {
        keqingSelected = true;
        photoCounter = 0;
        forwardButton.isEnabled = true;
        backButton.isEnabled = false;
        artworkName.text = "Character Portrait"
        if(keqingSelected == true){
            selectKeqing()
            deselectHuTao()
            deselectGanyu()
            deselectYanfei()
            deselectZhongli()
            deselectChilde()
            deselectKazuha()
            deselectChongyun()
            ganyuSelected = false
            hutaoSelected = false
            yanfeiSelected = false
            zhongliSelected = false
            chongyunSelected = false
            kazuhaSelected = false
            childeSelected = false
            characterArtwork.image = keqingImages[0]
        }
        else if (keqingSelected == false){
            deselectKeqing()
        }
    }
    @IBAction func yanfeiButton(_ sender: UIButton) {
        yanfeiSelected = true;
        photoCounter = 0;
        forwardButton.isEnabled = true;
        backButton.isEnabled = false;
        artworkName.text = "Character Portrait"
        if(yanfeiSelected == true){
            selectYanfei()
            deselectHuTao()
            deselectGanyu()
            deselectKeqing()
            deselectZhongli()
            deselectChilde()
            deselectKazuha()
            deselectChongyun()
            keqingSelected = false
            hutaoSelected = false
            ganyuSelected = false
            zhongliSelected = false
            chongyunSelected = false
            kazuhaSelected = false
            childeSelected = false
            characterArtwork.image = yanfeiImages[0]
        }
        else if (yanfeiSelected == false){
            deselectYanfei()
        }
    }
    
    @IBAction func zhongliButton(_ sender: UIButton) {
        zhongliSelected = true;
        photoCounter = 0;
        forwardButton.isEnabled = true;
        backButton.isEnabled = false;
        artworkName.text = "Character Portrait"
        if(zhongliSelected == true){
            selectZhongli()
            deselectHuTao()
            deselectGanyu()
            deselectKeqing()
            deselectYanfei()
            deselectChilde()
            deselectKazuha()
            deselectChongyun()
            keqingSelected = false
            hutaoSelected = false
            yanfeiSelected = false
            ganyuSelected = false
            chongyunSelected = false
            kazuhaSelected = false
            childeSelected = false
            characterArtwork.image = zhongliImages[0]
        }
        else if (zhongliSelected == false){
            deselectZhongli()
        }
    }
    @IBAction func childeButton(_ sender: UIButton) {
        childeSelected = true;
        photoCounter = 0;
        forwardButton.isEnabled = true;
        backButton.isEnabled = false;
        artworkName.text = "Character Portrait"
        if(childeSelected == true){
            selectChilde()
            deselectHuTao()
            deselectGanyu()
            deselectKeqing()
            deselectYanfei()
            deselectZhongli()
            deselectKazuha()
            deselectChongyun()
            keqingSelected = false
            hutaoSelected = false
            yanfeiSelected = false
            zhongliSelected = false
            chongyunSelected = false
            kazuhaSelected = false
            ganyuSelected = false
            characterArtwork.image = childeImages[0]
        }
        else if (childeSelected == false){
            deselectChilde()
        }
    }
    @IBAction func kazuhaButton(_ sender: Any) {
        kazuhaSelected = true;
        photoCounter = 0;
        forwardButton.isEnabled = true;
        backButton.isEnabled = false;
        artworkName.text = "Character Portrait"
        if(kazuhaSelected == true){
            selectKazuha()
            deselectHuTao()
            deselectGanyu()
            deselectKeqing()
            deselectYanfei()
            deselectZhongli()
            deselectChilde()
            deselectChongyun()
            keqingSelected = false
            hutaoSelected = false
            yanfeiSelected = false
            zhongliSelected = false
            chongyunSelected = false
            ganyuSelected = false
            childeSelected = false
            characterArtwork.image = kazuhaImages[0]
        }
        else if (kazuhaSelected == false){
            deselectKazuha()
        }
    }

    @IBAction func chongyunButton(_ sender: UIButton) {
        chongyunSelected = true;
        photoCounter = 0;
        forwardButton.isEnabled = true;
        backButton.isEnabled = false;
        artworkName.text = "Character Portrait"
        if(chongyunSelected == true){
            selectChongyun()
            deselectHuTao()
            deselectGanyu()
            deselectKeqing()
            deselectYanfei()
            deselectZhongli()
            deselectChilde()
            deselectKazuha()
            keqingSelected = false
            hutaoSelected = false
            yanfeiSelected = false
            zhongliSelected = false
            ganyuSelected = false
            kazuhaSelected = false
            childeSelected = false
            characterArtwork.image = chongyunImages[0]
        }
        else if (chongyunSelected == false){
            deselectChongyun()
        }
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()

        // Do any additional setup after loading the view.
    }
    
    @IBAction func goForward(_ sender: UIButton) {
        if hutaoSelected == true{
            photoCounter += 1
            if photoCounter == 1{
                characterArtwork.image = huTaoImages[1]
                forwardButton.isEnabled = true
                backButton.isEnabled = true
                artworkName.text = "Character Wish"
            }
            else if photoCounter == 2{
                characterArtwork.image = huTaoImages[2]
                forwardButton.isEnabled = false
                backButton.isEnabled = true
                artworkName.text = "Character Sticker"
            }
            else if photoCounter > 2{
                forwardButton.isEnabled = false
                photoCounter = 2
            }
        }
        if ganyuSelected == true{
            photoCounter += 1
            if photoCounter == 1{
                characterArtwork.image = ganyuImages[1]
                forwardButton.isEnabled = true
                backButton.isEnabled = true
                artworkName.text = "Character Wish"
            }
            else if photoCounter == 2{
                characterArtwork.image = ganyuImages[2]
                forwardButton.isEnabled = false
                backButton.isEnabled = true
                artworkName.text = "Character Sticker"
            }
            else if photoCounter > 2{
                forwardButton.isEnabled = false
                photoCounter = 2
            }
        }
        if keqingSelected == true{
            photoCounter += 1
            if photoCounter == 1{
                characterArtwork.image = keqingImages[1]
                forwardButton.isEnabled = true
                backButton.isEnabled = true
                artworkName.text = "Character Wish"
            }
            else if photoCounter == 2{
                characterArtwork.image = keqingImages[2]
                forwardButton.isEnabled = false
                backButton.isEnabled = true
                artworkName.text = "Character Sticker"
            }
            else if photoCounter > 2{
                forwardButton.isEnabled = false
                photoCounter = 2
            }
        }
        if yanfeiSelected == true{
            photoCounter += 1
            if photoCounter == 1{
                characterArtwork.image = yanfeiImages[1]
                forwardButton.isEnabled = true
                backButton.isEnabled = true
                artworkName.text = "Character Wish"
            }
            else if photoCounter == 2{
                characterArtwork.image = yanfeiImages[2]
                forwardButton.isEnabled = false
                backButton.isEnabled = true
                artworkName.text = "Character Sticker"
            }
            else if photoCounter > 2{
                forwardButton.isEnabled = false
                photoCounter = 2
            }
        }
        if zhongliSelected == true{
            photoCounter += 1
            if photoCounter == 1{
                characterArtwork.image = zhongliImages[1]
                forwardButton.isEnabled = true
                backButton.isEnabled = true
                artworkName.text = "Character Wish"
            }
            else if photoCounter == 2{
                characterArtwork.image = zhongliImages[2]
                forwardButton.isEnabled = false
                backButton.isEnabled = true
                artworkName.text = "Character Sticker"
            }
            else if photoCounter > 2{
                forwardButton.isEnabled = false
                photoCounter = 2
            }
        }
        if childeSelected == true{
            photoCounter += 1
            if photoCounter == 1{
                characterArtwork.image = childeImages[1]
                forwardButton.isEnabled = true
                backButton.isEnabled = true
                artworkName.text = "Character Wish"
            }
            else if photoCounter == 2{
                characterArtwork.image = childeImages[2]
                forwardButton.isEnabled = false
                backButton.isEnabled = true
                artworkName.text = "Character Sticker"
            }
            else if photoCounter > 2{
                forwardButton.isEnabled = false
                photoCounter = 2
            }
        }
        if kazuhaSelected == true{
            photoCounter += 1
            if photoCounter == 1{
                characterArtwork.image = kazuhaImages[1]
                forwardButton.isEnabled = true
                backButton.isEnabled = true
                artworkName.text = "Character Wish"
            }
            else if photoCounter == 2{
                characterArtwork.image = kazuhaImages[2]
                forwardButton.isEnabled = false
                backButton.isEnabled = true
                artworkName.text = "Character Sticker"
            }
            else if photoCounter > 2{
                forwardButton.isEnabled = false
                photoCounter = 2
            }
        }
        if chongyunSelected == true{
            photoCounter += 1
            if photoCounter == 1{
                characterArtwork.image = chongyunImages[1]
                forwardButton.isEnabled = true
                backButton.isEnabled = true
                artworkName.text = "Character Wish"
            }
            else if photoCounter == 2{
                characterArtwork.image = chongyunImages[2]
                forwardButton.isEnabled = false
                backButton.isEnabled = true
                artworkName.text = "Character Sticker"
            }
            else if photoCounter > 2{
                forwardButton.isEnabled = false
                photoCounter = 2
            }
        }
    }
    
    @IBAction func goBackward(_ sender: UIButton) {
        if hutaoSelected == true{
            photoCounter -= 1
            if photoCounter == 1{
                characterArtwork.image = huTaoImages[1]
                forwardButton.isEnabled = true
                backButton.isEnabled = true
                artworkName.text = "Character Wish"
            }
            else if photoCounter == 0{
                characterArtwork.image = huTaoImages[0]
                forwardButton.isEnabled = true
                backButton.isEnabled = false
                artworkName.text = "Character Portrait"
            }
            else if photoCounter > 0{
                backButton.isEnabled = false
                photoCounter = 0

            }
        }
        if ganyuSelected == true{
            photoCounter -= 1
            if photoCounter == 1{
                characterArtwork.image = ganyuImages[1]
                forwardButton.isEnabled = true
                backButton.isEnabled = true
                artworkName.text = "Character Wish"
            }
            else if photoCounter == 0{
                characterArtwork.image = ganyuImages[0]
                forwardButton.isEnabled = true
                backButton.isEnabled = false
                artworkName.text = "Character Portrait"
            }
            else if photoCounter > 0{
                backButton.isEnabled = false
                photoCounter = 0

            }
        }
        if keqingSelected == true{
            photoCounter -= 1
            if photoCounter == 1{
                characterArtwork.image = keqingImages[1]
                forwardButton.isEnabled = true
                backButton.isEnabled = true
                artworkName.text = "Character Wish"
            }
            else if photoCounter == 0{
                characterArtwork.image = keqingImages[0]
                forwardButton.isEnabled = true
                backButton.isEnabled = false
                artworkName.text = "Character Portrait"
            }
            else if photoCounter > 0{
                backButton.isEnabled = false
                photoCounter = 0

            }
        }
        if yanfeiSelected == true{
            photoCounter -= 1
            if photoCounter == 1{
                characterArtwork.image = yanfeiImages[1]
                forwardButton.isEnabled = true
                backButton.isEnabled = true
                artworkName.text = "Character Wish"
            }
            else if photoCounter == 0{
                characterArtwork.image = yanfeiImages[0]
                forwardButton.isEnabled = true
                backButton.isEnabled = false
                artworkName.text = "Character Portrait"
            }
            else if photoCounter > 0{
                backButton.isEnabled = false
                photoCounter = 0

            }
        }
        if zhongliSelected == true{
            photoCounter -= 1
            if photoCounter == 1{
                characterArtwork.image = zhongliImages[1]
                forwardButton.isEnabled = true
                backButton.isEnabled = true
                artworkName.text = "Character Wish"
            }
            else if photoCounter == 0{
                characterArtwork.image = zhongliImages[0]
                forwardButton.isEnabled = true
                backButton.isEnabled = false
                artworkName.text = "Character Portrait"
            }
            else if photoCounter > 0{
                backButton.isEnabled = false
                photoCounter = 0

            }
        }
        if childeSelected == true{
            photoCounter -= 1
            if photoCounter == 1{
                characterArtwork.image = childeImages[1]
                forwardButton.isEnabled = true
                backButton.isEnabled = true
                artworkName.text = "Character Wish"
            }
            else if photoCounter == 0{
                characterArtwork.image = childeImages[0]
                forwardButton.isEnabled = true
                backButton.isEnabled = false
                artworkName.text = "Character Portrait"
            }
            else if photoCounter > 0{
                backButton.isEnabled = false
                photoCounter = 0

            }
        }
        if kazuhaSelected == true{
            photoCounter -= 1
            if photoCounter == 1{
                characterArtwork.image = kazuhaImages[1]
                forwardButton.isEnabled = true
                backButton.isEnabled = true
                artworkName.text = "Character Wish"
            }
            else if photoCounter == 0{
                characterArtwork.image = kazuhaImages[0]
                forwardButton.isEnabled = true
                backButton.isEnabled = false
                artworkName.text = "Character Portrait"
            }
            else if photoCounter > 0{
                backButton.isEnabled = false
                photoCounter = 0

            }
        }
        if chongyunSelected == true{
            photoCounter -= 1
            if photoCounter == 1{
                characterArtwork.image = chongyunImages[1]
                forwardButton.isEnabled = true
                backButton.isEnabled = true
                artworkName.text = "Character Wish"
            }
            else if photoCounter == 0{
                characterArtwork.image = chongyunImages[0]
                forwardButton.isEnabled = true
                backButton.isEnabled = false
                artworkName.text = "Character Portrait"
            }
            else if photoCounter > 0{
                backButton.isEnabled = false
                photoCounter = 0

            }
        }
    }
    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destination.
        // Pass the selected object to the new view controller.
    }
    */

}
