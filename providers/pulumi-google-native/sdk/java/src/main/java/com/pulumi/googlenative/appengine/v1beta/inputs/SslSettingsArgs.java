// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine.v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.appengine.v1beta.enums.SslSettingsSslManagementType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SSL configuration for a DomainMapping resource.
 * 
 */
public final class SslSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SslSettingsArgs Empty = new SslSettingsArgs();

    /**
     * ID of the AuthorizedCertificate resource configuring SSL for the application. Clearing this field will remove SSL support.By default, a managed certificate is automatically created for every domain mapping. To omit SSL support or to configure SSL manually, specify SslManagementType.MANUAL on a CREATE or UPDATE request. You must be authorized to administer the AuthorizedCertificate resource to manually map it to a DomainMapping resource. Example: 12345.
     * 
     */
    @Import(name="certificateId")
    private @Nullable Output<String> certificateId;

    /**
     * @return ID of the AuthorizedCertificate resource configuring SSL for the application. Clearing this field will remove SSL support.By default, a managed certificate is automatically created for every domain mapping. To omit SSL support or to configure SSL manually, specify SslManagementType.MANUAL on a CREATE or UPDATE request. You must be authorized to administer the AuthorizedCertificate resource to manually map it to a DomainMapping resource. Example: 12345.
     * 
     */
    public Optional<Output<String>> certificateId() {
        return Optional.ofNullable(this.certificateId);
    }

    /**
     * SSL management type for this domain. If AUTOMATIC, a managed certificate is automatically provisioned. If MANUAL, certificate_id must be manually specified in order to configure SSL for this domain.
     * 
     */
    @Import(name="sslManagementType")
    private @Nullable Output<SslSettingsSslManagementType> sslManagementType;

    /**
     * @return SSL management type for this domain. If AUTOMATIC, a managed certificate is automatically provisioned. If MANUAL, certificate_id must be manually specified in order to configure SSL for this domain.
     * 
     */
    public Optional<Output<SslSettingsSslManagementType>> sslManagementType() {
        return Optional.ofNullable(this.sslManagementType);
    }

    private SslSettingsArgs() {}

    private SslSettingsArgs(SslSettingsArgs $) {
        this.certificateId = $.certificateId;
        this.sslManagementType = $.sslManagementType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SslSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SslSettingsArgs $;

        public Builder() {
            $ = new SslSettingsArgs();
        }

        public Builder(SslSettingsArgs defaults) {
            $ = new SslSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateId ID of the AuthorizedCertificate resource configuring SSL for the application. Clearing this field will remove SSL support.By default, a managed certificate is automatically created for every domain mapping. To omit SSL support or to configure SSL manually, specify SslManagementType.MANUAL on a CREATE or UPDATE request. You must be authorized to administer the AuthorizedCertificate resource to manually map it to a DomainMapping resource. Example: 12345.
         * 
         * @return builder
         * 
         */
        public Builder certificateId(@Nullable Output<String> certificateId) {
            $.certificateId = certificateId;
            return this;
        }

        /**
         * @param certificateId ID of the AuthorizedCertificate resource configuring SSL for the application. Clearing this field will remove SSL support.By default, a managed certificate is automatically created for every domain mapping. To omit SSL support or to configure SSL manually, specify SslManagementType.MANUAL on a CREATE or UPDATE request. You must be authorized to administer the AuthorizedCertificate resource to manually map it to a DomainMapping resource. Example: 12345.
         * 
         * @return builder
         * 
         */
        public Builder certificateId(String certificateId) {
            return certificateId(Output.of(certificateId));
        }

        /**
         * @param sslManagementType SSL management type for this domain. If AUTOMATIC, a managed certificate is automatically provisioned. If MANUAL, certificate_id must be manually specified in order to configure SSL for this domain.
         * 
         * @return builder
         * 
         */
        public Builder sslManagementType(@Nullable Output<SslSettingsSslManagementType> sslManagementType) {
            $.sslManagementType = sslManagementType;
            return this;
        }

        /**
         * @param sslManagementType SSL management type for this domain. If AUTOMATIC, a managed certificate is automatically provisioned. If MANUAL, certificate_id must be manually specified in order to configure SSL for this domain.
         * 
         * @return builder
         * 
         */
        public Builder sslManagementType(SslSettingsSslManagementType sslManagementType) {
            return sslManagementType(Output.of(sslManagementType));
        }

        public SslSettingsArgs build() {
            return $;
        }
    }

}
