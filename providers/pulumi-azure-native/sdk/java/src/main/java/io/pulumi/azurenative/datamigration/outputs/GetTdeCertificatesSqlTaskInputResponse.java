// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.FileShareResponse;
import io.pulumi.azurenative.datamigration.outputs.SelectedCertificateInputResponse;
import io.pulumi.azurenative.datamigration.outputs.SqlConnectionInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetTdeCertificatesSqlTaskInputResponse {
    /**
     * Backup file share information for file share to be used for temporarily storing files.
     * 
     */
    private final FileShareResponse backupFileShare;
    /**
     * Connection information for SQL Server
     * 
     */
    private final SqlConnectionInfoResponse connectionInfo;
    /**
     * List containing certificate names and corresponding password to use for encrypting the exported certificate.
     * 
     */
    private final List<SelectedCertificateInputResponse> selectedCertificates;

    @OutputCustomType.Constructor({"backupFileShare","connectionInfo","selectedCertificates"})
    private GetTdeCertificatesSqlTaskInputResponse(
        FileShareResponse backupFileShare,
        SqlConnectionInfoResponse connectionInfo,
        List<SelectedCertificateInputResponse> selectedCertificates) {
        this.backupFileShare = Objects.requireNonNull(backupFileShare);
        this.connectionInfo = Objects.requireNonNull(connectionInfo);
        this.selectedCertificates = Objects.requireNonNull(selectedCertificates);
    }

    /**
     * Backup file share information for file share to be used for temporarily storing files.
     * 
     */
    public FileShareResponse getBackupFileShare() {
        return this.backupFileShare;
    }
    /**
     * Connection information for SQL Server
     * 
     */
    public SqlConnectionInfoResponse getConnectionInfo() {
        return this.connectionInfo;
    }
    /**
     * List containing certificate names and corresponding password to use for encrypting the exported certificate.
     * 
     */
    public List<SelectedCertificateInputResponse> getSelectedCertificates() {
        return this.selectedCertificates;
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
