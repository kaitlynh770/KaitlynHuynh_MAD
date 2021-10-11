//
//  Quiz.swift
//  Project1
//
//  Created by Kaitlyn Huynh on 10/5/21.
//

import UIKit

class Quiz: UIViewController {
    
    @IBOutlet weak var questionText: UILabel!
    @IBOutlet weak var questionImage: UIImageView!
    
    @IBOutlet weak var playAgainButton: UIButton!
    @IBOutlet weak var huTaoButton: UIButton!
    @IBOutlet weak var ganyuButton: UIButton!
    @IBOutlet weak var keqingButton: UIButton!
    @IBOutlet weak var yanfeiButton: UIButton!
    @IBOutlet weak var zhongliButton: UIButton!
    @IBOutlet weak var childeButton: UIButton!
    @IBOutlet weak var kazuhaButton: UIButton!
    @IBOutlet weak var chongyunButton: UIButton!
    @IBOutlet weak var nextQuestionButton: UIButton!
    
    
    @IBOutlet weak var introText: UILabel!
    var correctAnswers = [UIButton]()
    var score = 1
    var questionsAnswered = 0

    override func viewDidLoad() {
        super.viewDidLoad()
        nextQuestionButton.isHidden = true;
        playAgainButton.isHidden = true
        // Do any additional setup after loading the view.
    }
    
    @IBAction func startGame(_ sender: UIButton) {
        sender.isHidden = true
        introText.isHidden = true
        randomQuestions()
        playAgainButton.isHidden = true
    }
    
    @IBAction func playAgainButton(_ sender: UIButton) {
        score = 1
        questionsAnswered = 0
        resetButtons()
        playAgainButton.isHidden = true
        randomQuestions()
        
    }
    @IBAction func huTao(_ sender: UIButton) {
        for correctAnswer in correctAnswers{
            if correctAnswer == huTaoButton{
                huTaoButton.setImage(UIImage(named: "hu-tao-correct"), for: .normal)
                questionText.text = "Correct!"
                questionImage.image = UIImage (named: "correct-answer")
                score += 1
            }
            else{
                huTaoButton.setImage(UIImage(named: "hu-tao-incorrect"), for: .normal)
                questionText.text = "Wrong!"
                questionImage.image = UIImage(named: "incorrect-answer")
            }
        }
    }
    
    @IBAction func ganyu(_ sender: UIButton) {
        for correctAnswer in correctAnswers{
            if correctAnswer == ganyuButton{
                ganyuButton.setImage(UIImage(named: "ganyu-correct"), for: .normal)
                questionText.text = "Correct!"
                questionImage.image = UIImage (named: "correct-answer")
                score += 1
            }
            else{
                ganyuButton.setImage(UIImage(named: "ganyu-incorrect"), for: .normal)
                questionText.text = "Wrong!"
                questionImage.image = UIImage (named: "incorrect-answer")
            }
        }
    }
    
    @IBAction func keqing(_ sender: UIButton) {
        for correctAnswer in correctAnswers{
            if correctAnswer == keqingButton{
                keqingButton.setImage(UIImage(named: "keqing-correct"), for: .normal)
                questionText.text = "Correct!"
                questionImage.image = UIImage (named: "correct-answer")
                score += 1
            }
            else{
                keqingButton.setImage(UIImage(named: "keqing-incorrect"), for: .normal)
                questionText.text = "Wrong!"
                questionImage.image = UIImage (named: "incorrect-answer")
            }
        }
    }
    
    @IBAction func yanfei(_ sender: UIButton) {
        for correctAnswer in correctAnswers{
            if correctAnswer == yanfeiButton{
                yanfeiButton.setImage(UIImage(named: "yanfei-correct"), for: .normal)
                questionText.text = "Correct!"
                questionImage.image = UIImage (named: "correct-answer")
                score += 1
            }
            else{
                yanfeiButton.setImage(UIImage(named: "yanfei-incorrect"), for: .normal)
                questionText.text = "Wrong!"
                questionImage.image = UIImage (named: "incorrect-answer")
            }
        }
    }
    @IBAction func zhongli(_ sender: UIButton) {
        for correctAnswer in correctAnswers{
            if correctAnswer == zhongliButton{
                zhongliButton.setImage(UIImage(named: "zhongli-correct"), for: .normal)
                questionText.text = "Correct!"
                questionImage.image = UIImage (named: "correct-answer")
                score += 1
            }
            else{
                zhongliButton.setImage(UIImage(named: "zhongli-incorrect"), for: .normal)
                questionText.text = "Wrong!"
                questionImage.image = UIImage (named: "incorrect-answer")
            }
        }
    }
    
    @IBAction func childe(_ sender: UIButton) {
        for correctAnswer in correctAnswers{
            if correctAnswer == childeButton{
                childeButton.setImage(UIImage(named: "childe-correct"), for: .normal)
                questionText.text = "Correct!"
                questionImage.image = UIImage (named: "correct-answer")
                score += 1
            }
            else{
                childeButton.setImage(UIImage(named: "childe-incorrect"), for: .normal)
                questionText.text = "Wrong!"
                questionImage.image = UIImage (named: "incorrect-answer")
            }
        }
    }
    @IBAction func kazuha(_ sender: UIButton) {
        for correctAnswer in correctAnswers{
            if correctAnswer == kazuhaButton{
                kazuhaButton.setImage(UIImage(named: "kazuha-correct"), for: .normal)
                questionText.text = "Correct!"
                questionImage.image = UIImage (named: "correct-answer")
                score += 1
            }
            else{
                kazuhaButton.setImage(UIImage(named: "kazuha-incorrect"), for: .normal)
                questionText.text = "Wrong!"
                questionImage.image = UIImage (named: "incorrect-answer")
            }
        }
    }
    @IBAction func chongyun(_ sender: UIButton) {
        for correctAnswer in correctAnswers{
            if correctAnswer == chongyunButton{
                chongyunButton.setImage(UIImage(named: "chongyun-correct"), for: .normal)
                questionText.text = "Correct!"
                questionImage.image = UIImage (named: "correct-answer")
                score += 1
            }
            else{
                chongyunButton.setImage(UIImage(named: "chongyun-incorrect"), for: .normal)
                questionText.text = "Wrong!"
                questionImage.image = UIImage (named: "incorrect-answer")
            }
        }
    }
    
    @IBAction func nextQuestion(_ sender: UIButton) {
        randomQuestions()
    }
    func resetButtons(){
        huTaoButton.setImage(UIImage(named: "hu-tao-regular"), for: .normal)
        ganyuButton.setImage(UIImage(named: "ganyu-regular"), for: .normal)
        keqingButton.setImage(UIImage(named: "keqing-regular"), for: .normal)
        yanfeiButton.setImage(UIImage(named: "yanfei-regular"), for: .normal)
        zhongliButton.setImage(UIImage(named: "zhongli-regular"), for: .normal)
        childeButton.setImage(UIImage(named: "childe-regular"), for: .normal)
        kazuhaButton.setImage(UIImage(named: "kazuha-regular"), for: .normal)
        chongyunButton.setImage(UIImage(named: "chongyun-regular"), for: .normal)
    }
    func finishQuiz(){
        if questionsAnswered == 10{
            let finalScore = String(score)
            let totalQuestions = String(questionsAnswered)
            nextQuestionButton.isHidden = true;
            questionText.text = "You got " + finalScore + " out of " + totalQuestions;
            questionImage.image = UIImage(named:"childe-chibi")
            playAgainButton.isHidden = false
            nextQuestionButton.isHidden = true
        }
    }
    func randomQuestions(){
        nextQuestionButton.isHidden = false;
        var randomNumber = arc4random() % 15
        randomNumber += 1
        
        switch(randomNumber){
            case 1:
                resetButtons()
                correctAnswers.removeAll()
                questionText.text = "Who is associated with this ghost?"
                questionImage.image = UIImage(named: "hu-tao-ghost")
                correctAnswers.append(huTaoButton)
                questionsAnswered += 1
                finishQuiz()
                break
            case 2:
                resetButtons()
                correctAnswers.removeAll()
                questionText.text = "Who is an Electro user?"
                questionImage.image = UIImage(named: "electro-vision")
                correctAnswers.append(keqingButton)
                questionsAnswered += 1
                finishQuiz()
                break
            case 3:
                resetButtons()
                correctAnswers.removeAll()
                questionText.text = "Who can use this weapon?"
                questionImage.image = UIImage(named: "claymore")
                correctAnswers.append(chongyunButton)
                questionsAnswered += 1
                finishQuiz()
                break
            case 4:
                resetButtons()
                correctAnswers.removeAll()
                questionText.text = "Who is a Hydro user?"
                questionImage.image = UIImage(named: "anemo-vision")
                correctAnswers.append(childeButton)
                questionsAnswered += 1
                finishQuiz()
                break
            case 5:
                resetButtons()
                correctAnswers.removeAll()
                questionText.text = "Who is a Geo user?"
                questionImage.image = UIImage(named: "geo-vision")
                correctAnswers.append(zhongliButton)
                questionsAnswered += 1
                finishQuiz()
                break
            case 6:
                resetButtons()
                correctAnswers.removeAll()
                questionText.text = "Who is the consultant for the Wangsheng Funeral Parlor?"
                questionImage.image = UIImage(named: "wangsheng-funeral-parlor")
                correctAnswers.append(zhongliButton)
                questionsAnswered += 1
                finishQuiz()
                break
            case 7:
                resetButtons()
                correctAnswers.removeAll()
                questionText.text = "Who's constellation is this?"
                questionImage.image = UIImage(named: "childe-constellation")
                correctAnswers.append(childeButton)
                questionsAnswered += 1
                finishQuiz()
                break
            case 8:
                resetButtons()
                correctAnswers.removeAll()
                questionText.text = "Who's constellation is this?"
                questionImage.image = UIImage(named: "hu-tao-constellation")
                correctAnswers.append(huTaoButton)
                questionsAnswered += 1
                finishQuiz()
                break
            case 9:
                resetButtons()
                correctAnswers.removeAll()
                questionText.text = "Who is an Anemo user?"
                questionImage.image = UIImage(named: "anemo-vision")
                correctAnswers.append(kazuhaButton)
                questionsAnswered += 1
                finishQuiz()
                break
            case 10:
                resetButtons()
                correctAnswers.removeAll()
                questionText.text = "Who's favorite food is this?"
                questionImage.image = UIImage(named: "qingxin")
                correctAnswers.append(ganyuButton)
                questionsAnswered += 1
                finishQuiz()
                break
            case 11:
                resetButtons()
                correctAnswers.removeAll()
                questionText.text = "Who can use this weapon?"
                questionImage.image = UIImage(named: "catalyst")
                correctAnswers.append(yanfeiButton)
                questionsAnswered += 1
                finishQuiz()
                break
            case 12:
                resetButtons()
                correctAnswers.removeAll()
                questionText.text = "Who's signature dish is this?"
                questionImage.image = UIImage(named: "prosperous-peace")
                correctAnswers.append(ganyuButton)
                questionsAnswered += 1
                finishQuiz()
                break
            case 13:
                resetButtons()
                correctAnswers.removeAll()
                questionText.text = "Who can't handle spicy food?"
                questionImage.image = UIImage(named: "spicy-food")
                correctAnswers.append(chongyunButton)
                questionsAnswered += 1
                finishQuiz()
                break
            case 14:
                resetButtons()
                correctAnswers.removeAll()
                questionText.text = "Who's signature dish is this"
                questionImage.image = UIImage(named: "grilled-fish")
                correctAnswers.append(keqingButton)
                questionsAnswered += 1
                finishQuiz()
                break
            case 15:
                resetButtons()
                correctAnswers.removeAll()
                questionText.text = "Who is from Inazuma?"
                questionImage.image = UIImage(named: "inazuma")
                correctAnswers.append(kazuhaButton)
                questionsAnswered += 1
                finishQuiz()
                break
            default:
                break
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
//struct QuizQuestion{
//    let question: String
//    let answers: [Answer]
//}
//struct Answer{
//    let correctAnswer: UIButton
//    let correct: Bool
//}


