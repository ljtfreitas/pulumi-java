// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class VirtualGatewaySpecListenerTlsCertificateAcmGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecListenerTlsCertificateAcmGetArgs Empty = new VirtualGatewaySpecListenerTlsCertificateAcmGetArgs();

    /**
     * The Amazon Resource Name (ARN) for the certificate.
     * 
     */
    @InputImport(name="certificateArn", required=true)
    private final Input<String> certificateArn;

    public Input<String> getCertificateArn() {
        return this.certificateArn;
    }

    public VirtualGatewaySpecListenerTlsCertificateAcmGetArgs(Input<String> certificateArn) {
        this.certificateArn = Objects.requireNonNull(certificateArn, "expected parameter 'certificateArn' to be non-null");
    }

    private VirtualGatewaySpecListenerTlsCertificateAcmGetArgs() {
        this.certificateArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerTlsCertificateAcmGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> certificateArn;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListenerTlsCertificateAcmGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateArn = defaults.certificateArn;
        }

        public Builder setCertificateArn(Input<String> certificateArn) {
            this.certificateArn = Objects.requireNonNull(certificateArn);
            return this;
        }

        public Builder setCertificateArn(String certificateArn) {
            this.certificateArn = Input.of(Objects.requireNonNull(certificateArn));
            return this;
        }
        public VirtualGatewaySpecListenerTlsCertificateAcmGetArgs build() {
            return new VirtualGatewaySpecListenerTlsCertificateAcmGetArgs(certificateArn);
        }
    }
}
