// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.worklink.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebsiteCertificateAuthorityAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final WebsiteCertificateAuthorityAssociationState Empty = new WebsiteCertificateAuthorityAssociationState();

    /**
     * The root certificate of the Certificate Authority.
     * 
     */
    @InputImport(name="certificate")
    private final @Nullable Input<String> certificate;

    public Input<String> getCertificate() {
        return this.certificate == null ? Input.empty() : this.certificate;
    }

    /**
     * The certificate name to display.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The ARN of the fleet.
     * 
     */
    @InputImport(name="fleetArn")
    private final @Nullable Input<String> fleetArn;

    public Input<String> getFleetArn() {
        return this.fleetArn == null ? Input.empty() : this.fleetArn;
    }

    /**
     * A unique identifier for the Certificate Authority.
     * 
     */
    @InputImport(name="websiteCaId")
    private final @Nullable Input<String> websiteCaId;

    public Input<String> getWebsiteCaId() {
        return this.websiteCaId == null ? Input.empty() : this.websiteCaId;
    }

    public WebsiteCertificateAuthorityAssociationState(
        @Nullable Input<String> certificate,
        @Nullable Input<String> displayName,
        @Nullable Input<String> fleetArn,
        @Nullable Input<String> websiteCaId) {
        this.certificate = certificate;
        this.displayName = displayName;
        this.fleetArn = fleetArn;
        this.websiteCaId = websiteCaId;
    }

    private WebsiteCertificateAuthorityAssociationState() {
        this.certificate = Input.empty();
        this.displayName = Input.empty();
        this.fleetArn = Input.empty();
        this.websiteCaId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebsiteCertificateAuthorityAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> certificate;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> fleetArn;
        private @Nullable Input<String> websiteCaId;

        public Builder() {
    	      // Empty
        }

        public Builder(WebsiteCertificateAuthorityAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.displayName = defaults.displayName;
    	      this.fleetArn = defaults.fleetArn;
    	      this.websiteCaId = defaults.websiteCaId;
        }

        public Builder setCertificate(@Nullable Input<String> certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder setCertificate(@Nullable String certificate) {
            this.certificate = Input.ofNullable(certificate);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setFleetArn(@Nullable Input<String> fleetArn) {
            this.fleetArn = fleetArn;
            return this;
        }

        public Builder setFleetArn(@Nullable String fleetArn) {
            this.fleetArn = Input.ofNullable(fleetArn);
            return this;
        }

        public Builder setWebsiteCaId(@Nullable Input<String> websiteCaId) {
            this.websiteCaId = websiteCaId;
            return this;
        }

        public Builder setWebsiteCaId(@Nullable String websiteCaId) {
            this.websiteCaId = Input.ofNullable(websiteCaId);
            return this;
        }
        public WebsiteCertificateAuthorityAssociationState build() {
            return new WebsiteCertificateAuthorityAssociationState(certificate, displayName, fleetArn, websiteCaId);
        }
    }
}
