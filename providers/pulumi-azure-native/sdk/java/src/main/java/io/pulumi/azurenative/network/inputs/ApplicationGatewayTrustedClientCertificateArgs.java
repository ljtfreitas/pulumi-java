// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Trusted client certificates of an application gateway.
 * 
 */
public final class ApplicationGatewayTrustedClientCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayTrustedClientCertificateArgs Empty = new ApplicationGatewayTrustedClientCertificateArgs();

    /**
     * Certificate public data.
     * 
     */
    @Import(name="data")
      private final @Nullable Output<String> data;

    public Output<String> getData() {
        return this.data == null ? Output.empty() : this.data;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * Name of the trusted client certificate that is unique within an Application Gateway.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public ApplicationGatewayTrustedClientCertificateArgs(
        @Nullable Output<String> data,
        @Nullable Output<String> id,
        @Nullable Output<String> name) {
        this.data = data;
        this.id = id;
        this.name = name;
    }

    private ApplicationGatewayTrustedClientCertificateArgs() {
        this.data = Output.empty();
        this.id = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayTrustedClientCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> data;
        private @Nullable Output<String> id;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayTrustedClientCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        public Builder data(@Nullable Output<String> data) {
            this.data = data;
            return this;
        }

        public Builder data(@Nullable String data) {
            this.data = Output.ofNullable(data);
            return this;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public ApplicationGatewayTrustedClientCertificateArgs build() {
            return new ApplicationGatewayTrustedClientCertificateArgs(data, id, name);
        }
    }
}
