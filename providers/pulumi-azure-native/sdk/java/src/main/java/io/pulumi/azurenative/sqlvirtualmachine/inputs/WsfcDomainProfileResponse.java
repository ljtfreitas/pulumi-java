// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Active Directory account details to operate Windows Server Failover Cluster.
 * 
 */
public final class WsfcDomainProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final WsfcDomainProfileResponse Empty = new WsfcDomainProfileResponse();

    /**
     * Account name used for creating cluster (at minimum needs permissions to 'Create Computer Objects' in domain).
     * 
     */
    @InputImport(name="clusterBootstrapAccount")
    private final @Nullable String clusterBootstrapAccount;

    public Optional<String> getClusterBootstrapAccount() {
        return this.clusterBootstrapAccount == null ? Optional.empty() : Optional.ofNullable(this.clusterBootstrapAccount);
    }

    /**
     * Account name used for operating cluster i.e. will be part of administrators group on all the participating virtual machines in the cluster.
     * 
     */
    @InputImport(name="clusterOperatorAccount")
    private final @Nullable String clusterOperatorAccount;

    public Optional<String> getClusterOperatorAccount() {
        return this.clusterOperatorAccount == null ? Optional.empty() : Optional.ofNullable(this.clusterOperatorAccount);
    }

    /**
     * Fully qualified name of the domain.
     * 
     */
    @InputImport(name="domainFqdn")
    private final @Nullable String domainFqdn;

    public Optional<String> getDomainFqdn() {
        return this.domainFqdn == null ? Optional.empty() : Optional.ofNullable(this.domainFqdn);
    }

    /**
     * Optional path for fileshare witness.
     * 
     */
    @InputImport(name="fileShareWitnessPath")
    private final @Nullable String fileShareWitnessPath;

    public Optional<String> getFileShareWitnessPath() {
        return this.fileShareWitnessPath == null ? Optional.empty() : Optional.ofNullable(this.fileShareWitnessPath);
    }

    /**
     * Organizational Unit path in which the nodes and cluster will be present.
     * 
     */
    @InputImport(name="ouPath")
    private final @Nullable String ouPath;

    public Optional<String> getOuPath() {
        return this.ouPath == null ? Optional.empty() : Optional.ofNullable(this.ouPath);
    }

    /**
     * Account name under which SQL service will run on all participating SQL virtual machines in the cluster.
     * 
     */
    @InputImport(name="sqlServiceAccount")
    private final @Nullable String sqlServiceAccount;

    public Optional<String> getSqlServiceAccount() {
        return this.sqlServiceAccount == null ? Optional.empty() : Optional.ofNullable(this.sqlServiceAccount);
    }

    /**
     * Fully qualified ARM resource id of the witness storage account.
     * 
     */
    @InputImport(name="storageAccountUrl")
    private final @Nullable String storageAccountUrl;

    public Optional<String> getStorageAccountUrl() {
        return this.storageAccountUrl == null ? Optional.empty() : Optional.ofNullable(this.storageAccountUrl);
    }

    public WsfcDomainProfileResponse(
        @Nullable String clusterBootstrapAccount,
        @Nullable String clusterOperatorAccount,
        @Nullable String domainFqdn,
        @Nullable String fileShareWitnessPath,
        @Nullable String ouPath,
        @Nullable String sqlServiceAccount,
        @Nullable String storageAccountUrl) {
        this.clusterBootstrapAccount = clusterBootstrapAccount;
        this.clusterOperatorAccount = clusterOperatorAccount;
        this.domainFqdn = domainFqdn;
        this.fileShareWitnessPath = fileShareWitnessPath;
        this.ouPath = ouPath;
        this.sqlServiceAccount = sqlServiceAccount;
        this.storageAccountUrl = storageAccountUrl;
    }

    private WsfcDomainProfileResponse() {
        this.clusterBootstrapAccount = null;
        this.clusterOperatorAccount = null;
        this.domainFqdn = null;
        this.fileShareWitnessPath = null;
        this.ouPath = null;
        this.sqlServiceAccount = null;
        this.storageAccountUrl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WsfcDomainProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clusterBootstrapAccount;
        private @Nullable String clusterOperatorAccount;
        private @Nullable String domainFqdn;
        private @Nullable String fileShareWitnessPath;
        private @Nullable String ouPath;
        private @Nullable String sqlServiceAccount;
        private @Nullable String storageAccountUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(WsfcDomainProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterBootstrapAccount = defaults.clusterBootstrapAccount;
    	      this.clusterOperatorAccount = defaults.clusterOperatorAccount;
    	      this.domainFqdn = defaults.domainFqdn;
    	      this.fileShareWitnessPath = defaults.fileShareWitnessPath;
    	      this.ouPath = defaults.ouPath;
    	      this.sqlServiceAccount = defaults.sqlServiceAccount;
    	      this.storageAccountUrl = defaults.storageAccountUrl;
        }

        public Builder setClusterBootstrapAccount(@Nullable String clusterBootstrapAccount) {
            this.clusterBootstrapAccount = clusterBootstrapAccount;
            return this;
        }

        public Builder setClusterOperatorAccount(@Nullable String clusterOperatorAccount) {
            this.clusterOperatorAccount = clusterOperatorAccount;
            return this;
        }

        public Builder setDomainFqdn(@Nullable String domainFqdn) {
            this.domainFqdn = domainFqdn;
            return this;
        }

        public Builder setFileShareWitnessPath(@Nullable String fileShareWitnessPath) {
            this.fileShareWitnessPath = fileShareWitnessPath;
            return this;
        }

        public Builder setOuPath(@Nullable String ouPath) {
            this.ouPath = ouPath;
            return this;
        }

        public Builder setSqlServiceAccount(@Nullable String sqlServiceAccount) {
            this.sqlServiceAccount = sqlServiceAccount;
            return this;
        }

        public Builder setStorageAccountUrl(@Nullable String storageAccountUrl) {
            this.storageAccountUrl = storageAccountUrl;
            return this;
        }

        public WsfcDomainProfileResponse build() {
            return new WsfcDomainProfileResponse(clusterBootstrapAccount, clusterOperatorAccount, domainFqdn, fileShareWitnessPath, ouPath, sqlServiceAccount, storageAccountUrl);
        }
    }
}
