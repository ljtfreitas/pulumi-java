// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.FileShareResponse;
import io.pulumi.azurenative.datamigration.inputs.SelectedCertificateInputResponse;
import io.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


/**
 * Input for the task that gets TDE certificates in Base64 encoded format.
 * 
 */
public final class GetTdeCertificatesSqlTaskInputResponse extends io.pulumi.resources.InvokeArgs {

    public static final GetTdeCertificatesSqlTaskInputResponse Empty = new GetTdeCertificatesSqlTaskInputResponse();

    /**
     * Backup file share information for file share to be used for temporarily storing files.
     * 
     */
    @InputImport(name="backupFileShare", required=true)
        private final FileShareResponse backupFileShare;

    public FileShareResponse getBackupFileShare() {
        return this.backupFileShare;
    }

    /**
     * Connection information for SQL Server
     * 
     */
    @InputImport(name="connectionInfo", required=true)
        private final SqlConnectionInfoResponse connectionInfo;

    public SqlConnectionInfoResponse getConnectionInfo() {
        return this.connectionInfo;
    }

    /**
     * List containing certificate names and corresponding password to use for encrypting the exported certificate.
     * 
     */
    @InputImport(name="selectedCertificates", required=true)
        private final List<SelectedCertificateInputResponse> selectedCertificates;

    public List<SelectedCertificateInputResponse> getSelectedCertificates() {
        return this.selectedCertificates;
    }

    public GetTdeCertificatesSqlTaskInputResponse(
        FileShareResponse backupFileShare,
        SqlConnectionInfoResponse connectionInfo,
        List<SelectedCertificateInputResponse> selectedCertificates) {
        this.backupFileShare = Objects.requireNonNull(backupFileShare, "expected parameter 'backupFileShare' to be non-null");
        this.connectionInfo = Objects.requireNonNull(connectionInfo, "expected parameter 'connectionInfo' to be non-null");
        this.selectedCertificates = Objects.requireNonNull(selectedCertificates, "expected parameter 'selectedCertificates' to be non-null");
    }

    private GetTdeCertificatesSqlTaskInputResponse() {
        this.backupFileShare = null;
        this.connectionInfo = null;
        this.selectedCertificates = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTdeCertificatesSqlTaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileShareResponse backupFileShare;
        private SqlConnectionInfoResponse connectionInfo;
        private List<SelectedCertificateInputResponse> selectedCertificates;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTdeCertificatesSqlTaskInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupFileShare = defaults.backupFileShare;
    	      this.connectionInfo = defaults.connectionInfo;
    	      this.selectedCertificates = defaults.selectedCertificates;
        }

        public Builder setBackupFileShare(FileShareResponse backupFileShare) {
            this.backupFileShare = Objects.requireNonNull(backupFileShare);
            return this;
        }

        public Builder setConnectionInfo(SqlConnectionInfoResponse connectionInfo) {
            this.connectionInfo = Objects.requireNonNull(connectionInfo);
            return this;
        }

        public Builder setSelectedCertificates(List<SelectedCertificateInputResponse> selectedCertificates) {
            this.selectedCertificates = Objects.requireNonNull(selectedCertificates);
            return this;
        }
        public GetTdeCertificatesSqlTaskInputResponse build() {
            return new GetTdeCertificatesSqlTaskInputResponse(backupFileShare, connectionInfo, selectedCertificates);
        }
    }
}
