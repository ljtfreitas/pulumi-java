// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainMappingSslSettings {
    /**
     * ID of the AuthorizedCertificate resource configuring SSL for the application. Clearing this field will
     * remove SSL support.
     * By default, a managed certificate is automatically created for every domain mapping. To omit SSL support
     * or to configure SSL manually, specify `SslManagementType.MANUAL` on a `CREATE` or `UPDATE` request. You must be
     * authorized to administer the `AuthorizedCertificate` resource to manually map it to a DomainMapping resource.
     * Example: 12345.
     * 
     */
    private final @Nullable String certificateId;
    /**
     * - 
     * ID of the managed `AuthorizedCertificate` resource currently being provisioned, if applicable. Until the new
     * managed certificate has been successfully provisioned, the previous SSL state will be preserved. Once the
     * provisioning process completes, the `certificateId` field will reflect the new managed certificate and this
     * field will be left empty. To remove SSL support while there is still a pending managed certificate, clear the
     * `certificateId` field with an update request.
     * 
     */
    private final @Nullable String pendingManagedCertificateId;
    /**
     * SSL management type for this domain. If `AUTOMATIC`, a managed certificate is automatically provisioned.
     * If `MANUAL`, `certificateId` must be manually specified in order to configure SSL for this domain.
     * Possible values are `AUTOMATIC` and `MANUAL`.
     * 
     */
    private final String sslManagementType;

    @CustomType.Constructor
    private DomainMappingSslSettings(
        @CustomType.Parameter("certificateId") @Nullable String certificateId,
        @CustomType.Parameter("pendingManagedCertificateId") @Nullable String pendingManagedCertificateId,
        @CustomType.Parameter("sslManagementType") String sslManagementType) {
        this.certificateId = certificateId;
        this.pendingManagedCertificateId = pendingManagedCertificateId;
        this.sslManagementType = sslManagementType;
    }

    /**
     * ID of the AuthorizedCertificate resource configuring SSL for the application. Clearing this field will
     * remove SSL support.
     * By default, a managed certificate is automatically created for every domain mapping. To omit SSL support
     * or to configure SSL manually, specify `SslManagementType.MANUAL` on a `CREATE` or `UPDATE` request. You must be
     * authorized to administer the `AuthorizedCertificate` resource to manually map it to a DomainMapping resource.
     * Example: 12345.
     * 
    */
    public Optional<String> certificateId() {
        return Optional.ofNullable(this.certificateId);
    }
    /**
     * - 
     * ID of the managed `AuthorizedCertificate` resource currently being provisioned, if applicable. Until the new
     * managed certificate has been successfully provisioned, the previous SSL state will be preserved. Once the
     * provisioning process completes, the `certificateId` field will reflect the new managed certificate and this
     * field will be left empty. To remove SSL support while there is still a pending managed certificate, clear the
     * `certificateId` field with an update request.
     * 
    */
    public Optional<String> pendingManagedCertificateId() {
        return Optional.ofNullable(this.pendingManagedCertificateId);
    }
    /**
     * SSL management type for this domain. If `AUTOMATIC`, a managed certificate is automatically provisioned.
     * If `MANUAL`, `certificateId` must be manually specified in order to configure SSL for this domain.
     * Possible values are `AUTOMATIC` and `MANUAL`.
     * 
    */
    public String sslManagementType() {
        return this.sslManagementType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainMappingSslSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String certificateId;
        private @Nullable String pendingManagedCertificateId;
        private String sslManagementType;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainMappingSslSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateId = defaults.certificateId;
    	      this.pendingManagedCertificateId = defaults.pendingManagedCertificateId;
    	      this.sslManagementType = defaults.sslManagementType;
        }

        public Builder certificateId(@Nullable String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public Builder pendingManagedCertificateId(@Nullable String pendingManagedCertificateId) {
            this.pendingManagedCertificateId = pendingManagedCertificateId;
            return this;
        }
        public Builder sslManagementType(String sslManagementType) {
            this.sslManagementType = Objects.requireNonNull(sslManagementType);
            return this;
        }        public DomainMappingSslSettings build() {
            return new DomainMappingSslSettings(certificateId, pendingManagedCertificateId, sslManagementType);
        }
    }
}
