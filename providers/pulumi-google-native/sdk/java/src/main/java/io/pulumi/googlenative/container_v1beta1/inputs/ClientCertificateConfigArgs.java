// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for client certificates on the cluster.
 * 
 */
public final class ClientCertificateConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClientCertificateConfigArgs Empty = new ClientCertificateConfigArgs();

    /**
     * Issue a client certificate.
     * 
     */
    @InputImport(name="issueClientCertificate")
      private final @Nullable Input<Boolean> issueClientCertificate;

    public Input<Boolean> getIssueClientCertificate() {
        return this.issueClientCertificate == null ? Input.empty() : this.issueClientCertificate;
    }

    public ClientCertificateConfigArgs(@Nullable Input<Boolean> issueClientCertificate) {
        this.issueClientCertificate = issueClientCertificate;
    }

    private ClientCertificateConfigArgs() {
        this.issueClientCertificate = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientCertificateConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> issueClientCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientCertificateConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.issueClientCertificate = defaults.issueClientCertificate;
        }

        public Builder setIssueClientCertificate(@Nullable Input<Boolean> issueClientCertificate) {
            this.issueClientCertificate = issueClientCertificate;
            return this;
        }

        public Builder setIssueClientCertificate(@Nullable Boolean issueClientCertificate) {
            this.issueClientCertificate = Input.ofNullable(issueClientCertificate);
            return this;
        }
        public ClientCertificateConfigArgs build() {
            return new ClientCertificateConfigArgs(issueClientCertificate);
        }
    }
}
