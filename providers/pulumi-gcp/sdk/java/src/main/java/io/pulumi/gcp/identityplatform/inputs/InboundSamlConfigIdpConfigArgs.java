// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.identityplatform.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.identityplatform.inputs.InboundSamlConfigIdpConfigIdpCertificateArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InboundSamlConfigIdpConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final InboundSamlConfigIdpConfigArgs Empty = new InboundSamlConfigIdpConfigArgs();

    /**
     * The IdP's certificate data to verify the signature in the SAMLResponse issued by the IDP.
     * Structure is documented below.
     * 
     */
    @Import(name="idpCertificates", required=true)
      private final Output<List<InboundSamlConfigIdpConfigIdpCertificateArgs>> idpCertificates;

    public Output<List<InboundSamlConfigIdpConfigIdpCertificateArgs>> idpCertificates() {
        return this.idpCertificates;
    }

    /**
     * Unique identifier for all SAML entities
     * 
     */
    @Import(name="idpEntityId", required=true)
      private final Output<String> idpEntityId;

    public Output<String> idpEntityId() {
        return this.idpEntityId;
    }

    /**
     * Indicates if outbounding SAMLRequest should be signed.
     * 
     */
    @Import(name="signRequest")
      private final @Nullable Output<Boolean> signRequest;

    public Output<Boolean> signRequest() {
        return this.signRequest == null ? Codegen.empty() : this.signRequest;
    }

    /**
     * URL to send Authentication request to.
     * 
     */
    @Import(name="ssoUrl", required=true)
      private final Output<String> ssoUrl;

    public Output<String> ssoUrl() {
        return this.ssoUrl;
    }

    public InboundSamlConfigIdpConfigArgs(
        Output<List<InboundSamlConfigIdpConfigIdpCertificateArgs>> idpCertificates,
        Output<String> idpEntityId,
        @Nullable Output<Boolean> signRequest,
        Output<String> ssoUrl) {
        this.idpCertificates = Objects.requireNonNull(idpCertificates, "expected parameter 'idpCertificates' to be non-null");
        this.idpEntityId = Objects.requireNonNull(idpEntityId, "expected parameter 'idpEntityId' to be non-null");
        this.signRequest = signRequest;
        this.ssoUrl = Objects.requireNonNull(ssoUrl, "expected parameter 'ssoUrl' to be non-null");
    }

    private InboundSamlConfigIdpConfigArgs() {
        this.idpCertificates = Codegen.empty();
        this.idpEntityId = Codegen.empty();
        this.signRequest = Codegen.empty();
        this.ssoUrl = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InboundSamlConfigIdpConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<InboundSamlConfigIdpConfigIdpCertificateArgs>> idpCertificates;
        private Output<String> idpEntityId;
        private @Nullable Output<Boolean> signRequest;
        private Output<String> ssoUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(InboundSamlConfigIdpConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idpCertificates = defaults.idpCertificates;
    	      this.idpEntityId = defaults.idpEntityId;
    	      this.signRequest = defaults.signRequest;
    	      this.ssoUrl = defaults.ssoUrl;
        }

        public Builder idpCertificates(Output<List<InboundSamlConfigIdpConfigIdpCertificateArgs>> idpCertificates) {
            this.idpCertificates = Objects.requireNonNull(idpCertificates);
            return this;
        }
        public Builder idpCertificates(List<InboundSamlConfigIdpConfigIdpCertificateArgs> idpCertificates) {
            this.idpCertificates = Output.of(Objects.requireNonNull(idpCertificates));
            return this;
        }
        public Builder idpCertificates(InboundSamlConfigIdpConfigIdpCertificateArgs... idpCertificates) {
            return idpCertificates(List.of(idpCertificates));
        }
        public Builder idpEntityId(Output<String> idpEntityId) {
            this.idpEntityId = Objects.requireNonNull(idpEntityId);
            return this;
        }
        public Builder idpEntityId(String idpEntityId) {
            this.idpEntityId = Output.of(Objects.requireNonNull(idpEntityId));
            return this;
        }
        public Builder signRequest(@Nullable Output<Boolean> signRequest) {
            this.signRequest = signRequest;
            return this;
        }
        public Builder signRequest(@Nullable Boolean signRequest) {
            this.signRequest = Codegen.ofNullable(signRequest);
            return this;
        }
        public Builder ssoUrl(Output<String> ssoUrl) {
            this.ssoUrl = Objects.requireNonNull(ssoUrl);
            return this;
        }
        public Builder ssoUrl(String ssoUrl) {
            this.ssoUrl = Output.of(Objects.requireNonNull(ssoUrl));
            return this;
        }        public InboundSamlConfigIdpConfigArgs build() {
            return new InboundSamlConfigIdpConfigArgs(idpCertificates, idpEntityId, signRequest, ssoUrl);
        }
    }
}
