// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.applicationloadbalancing.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerCertificateState extends io.pulumi.resources.ResourceArgs {

    public static final ListenerCertificateState Empty = new ListenerCertificateState();

    /**
     * The ARN of the certificate to attach to the listener.
     * 
     */
    @Import(name="certificateArn")
      private final @Nullable Output<String> certificateArn;

    public Output<String> getCertificateArn() {
        return this.certificateArn == null ? Output.empty() : this.certificateArn;
    }

    /**
     * The ARN of the listener to which to attach the certificate.
     * 
     */
    @Import(name="listenerArn")
      private final @Nullable Output<String> listenerArn;

    public Output<String> getListenerArn() {
        return this.listenerArn == null ? Output.empty() : this.listenerArn;
    }

    public ListenerCertificateState(
        @Nullable Output<String> certificateArn,
        @Nullable Output<String> listenerArn) {
        this.certificateArn = certificateArn;
        this.listenerArn = listenerArn;
    }

    private ListenerCertificateState() {
        this.certificateArn = Output.empty();
        this.listenerArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerCertificateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> certificateArn;
        private @Nullable Output<String> listenerArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerCertificateState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateArn = defaults.certificateArn;
    	      this.listenerArn = defaults.listenerArn;
        }

        public Builder certificateArn(@Nullable Output<String> certificateArn) {
            this.certificateArn = certificateArn;
            return this;
        }

        public Builder certificateArn(@Nullable String certificateArn) {
            this.certificateArn = Output.ofNullable(certificateArn);
            return this;
        }

        public Builder listenerArn(@Nullable Output<String> listenerArn) {
            this.listenerArn = listenerArn;
            return this;
        }

        public Builder listenerArn(@Nullable String listenerArn) {
            this.listenerArn = Output.ofNullable(listenerArn);
            return this;
        }
        public ListenerCertificateState build() {
            return new ListenerCertificateState(certificateArn, listenerArn);
        }
    }
}
