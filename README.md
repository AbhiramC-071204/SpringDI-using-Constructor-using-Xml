<img width="639" height="280" alt="{2F8D13BE-7157-4749-96AA-D0448ED5C4A6}" src="https://github.com/user-attachments/assets/9a391ba9-7a68-4a6e-b675-99eb627a8d53" />
Output
Interview Answer

Q: Why do we write private Address address; in GoldCustomer,PlatinumCustomer?

Answer:
private Address address; is an object reference variable used to achieve composition. It allows the GoldCustomer class to use the properties and methods of the Address class. Spring injects the Address bean through constructor injection and stores it in this variable, enabling the customer object to access address details without duplicating address-related code.
