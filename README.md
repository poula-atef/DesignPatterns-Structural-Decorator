# ايه هو البرنامج ده؟
- البرنامج ده هو عباره عن مثال لل Decorator Design Pattern باستخدام لغة java
# بنستخدم امتي ال Design Pattern ده؟
- بنستخدم ال design pattern ده لما يكون عندي object و عايز اضيف عليه functionality في خلال ال runtime .. و ده بيتم عن طريق اني احطله object في ال constructor بتاعه عشان ينفذ 
ال functionality بتاعته قبل ما ينفذ ال functionality الرئيسيه بتاعته .. مثلا المثال اللي في ال applcaition اننا قادرين نعمل notification ب كذا 
شكل منهم whatsapp و facebook و mail .. قي خلال ال runtime نقدر نحدد محتاجين نعمل notification فين الظبط سواء كان واحده منهم او مجموعه منهم
بترتيب معين.
# بيتكون من ايه البرنامج ده ؟
- ال package بتاعت ال entities:
  - ال INotification Interface و ده فيه ال methods اللي المفروض تبقي في اي Notifier
  - ال Notifier Class و ده ال parent بتاع ال Notifiers كلهم و فيه ال nested object عشان يكون موجود في كل ال Notifiers تطبيقا لل Decorator Design Pattern .. و بيعمل implement لل INotification Interface
  - ال FacebookNotifier Class و ده بيعمل extend من ال Notifier Class (و بالتالي بتعمل implement لل INotification Interface)
  - ال WhatsAppNotifier Class و ده بيعمل extend من ال Notifier Class (و بالتالي بتعمل implement لل INotification Interface)
  - ال MailNotifier Class و ده بيعمل extend من ال Notifier Class (و بالتالي بتعمل implement لل INotification Interface)
  - ال Notification Class و ده بيعمل Implement لل INotification Interface (و ده منفصل عن الباقيين عشان يقفل ال Decorator Substitution)
