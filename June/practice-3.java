@Transactional(propagation = Propagation.REQUIRES_NEW)
public void logAudit(Audit audit) { ... }
