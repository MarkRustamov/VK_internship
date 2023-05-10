# **VK_internship**
____
## **API-methods for saving events and obtaining statistics**
- The first method takes the name of the event and the status of the user (authorized or not) in the input parameters. The server then adds supporting information and saves the event (the ***save*** method).
- The second method allows you to filter by date and name of event and get aggregated information:
    - event name counter (the ***getEventNameStatistics*** method)
    - User IP-address counter (the ***getUserIpStatistics*** method)
    - User status counter (the ***getUserStatusStatistics*** method)
