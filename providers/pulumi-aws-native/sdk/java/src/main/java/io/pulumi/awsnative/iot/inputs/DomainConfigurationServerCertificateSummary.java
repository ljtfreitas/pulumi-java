// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.enums.DomainConfigurationServerCertificateSummaryServerCertificateStatus;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainConfigurationServerCertificateSummary extends io.pulumi.resources.InvokeArgs {

    public static final DomainConfigurationServerCertificateSummary Empty = new DomainConfigurationServerCertificateSummary();

    @InputImport(name="serverCertificateArn")
        private final @Nullable String serverCertificateArn;

    public Optional<String> getServerCertificateArn() {
        return this.serverCertificateArn == null ? Optional.empty() : Optional.ofNullable(this.serverCertificateArn);
    }

    @InputImport(name="serverCertificateStatus")
        private final @Nullable DomainConfigurationServerCertificateSummaryServerCertificateStatus serverCertificateStatus;

    public Optional<DomainConfigurationServerCertificateSummaryServerCertificateStatus> getServerCertificateStatus() {
        return this.serverCertificateStatus == null ? Optional.empty() : Optional.ofNullable(this.serverCertificateStatus);
    }

    @InputImport(name="serverCertificateStatusDetail")
        private final @Nullable String serverCertificateStatusDetail;

    public Optional<String> getServerCertificateStatusDetail() {
        return this.serverCertificateStatusDetail == null ? Optional.empty() : Optional.ofNullable(this.serverCertificateStatusDetail);
    }

    public DomainConfigurationServerCertificateSummary(
        @Nullable String serverCertificateArn,
        @Nullable DomainConfigurationServerCertificateSummaryServerCertificateStatus serverCertificateStatus,
        @Nullable String serverCertificateStatusDetail) {
        this.serverCertificateArn = serverCertificateArn;
        this.serverCertificateStatus = serverCertificateStatus;
        this.serverCertificateStatusDetail = serverCertificateStatusDetail;
    }

    private DomainConfigurationServerCertificateSummary() {
        this.serverCertificateArn = null;
        this.serverCertificateStatus = null;
        this.serverCertificateStatusDetail = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainConfigurationServerCertificateSummary defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String serverCertificateArn;
        private @Nullable DomainConfigurationServerCertificateSummaryServerCertificateStatus serverCertificateStatus;
        private @Nullable String serverCertificateStatusDetail;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainConfigurationServerCertificateSummary defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serverCertificateArn = defaults.serverCertificateArn;
    	      this.serverCertificateStatus = defaults.serverCertificateStatus;
    	      this.serverCertificateStatusDetail = defaults.serverCertificateStatusDetail;
        }

        public Builder setServerCertificateArn(@Nullable String serverCertificateArn) {
            this.serverCertificateArn = serverCertificateArn;
            return this;
        }

        public Builder setServerCertificateStatus(@Nullable DomainConfigurationServerCertificateSummaryServerCertificateStatus serverCertificateStatus) {
            this.serverCertificateStatus = serverCertificateStatus;
            return this;
        }

        public Builder setServerCertificateStatusDetail(@Nullable String serverCertificateStatusDetail) {
            this.serverCertificateStatusDetail = serverCertificateStatusDetail;
            return this;
        }
        public DomainConfigurationServerCertificateSummary build() {
            return new DomainConfigurationServerCertificateSummary(serverCertificateArn, serverCertificateStatus, serverCertificateStatusDetail);
        }
    }
}
