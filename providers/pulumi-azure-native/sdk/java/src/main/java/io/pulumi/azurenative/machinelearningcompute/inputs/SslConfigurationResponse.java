// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SSL configuration. If configured data-plane calls to user services will be exposed over SSL only.
 * 
 */
public final class SslConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final SslConfigurationResponse Empty = new SslConfigurationResponse();

    /**
     * The SSL cert data in PEM format.
     * 
     */
    @InputImport(name="cert")
        private final @Nullable String cert;

    public Optional<String> getCert() {
        return this.cert == null ? Optional.empty() : Optional.ofNullable(this.cert);
    }

    /**
     * The CName of the certificate.
     * 
     */
    @InputImport(name="cname")
        private final @Nullable String cname;

    public Optional<String> getCname() {
        return this.cname == null ? Optional.empty() : Optional.ofNullable(this.cname);
    }

    /**
     * The SSL key data in PEM format. This is not returned in response of GET/PUT on the resource. To see this please call listKeys API.
     * 
     */
    @InputImport(name="key")
        private final @Nullable String key;

    public Optional<String> getKey() {
        return this.key == null ? Optional.empty() : Optional.ofNullable(this.key);
    }

    /**
     * SSL status. Allowed values are Enabled and Disabled.
     * 
     */
    @InputImport(name="status")
        private final @Nullable String status;

    public Optional<String> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    public SslConfigurationResponse(
        @Nullable String cert,
        @Nullable String cname,
        @Nullable String key,
        @Nullable String status) {
        this.cert = cert;
        this.cname = cname;
        this.key = key;
        this.status = status == null ? "Enabled" : status;
    }

    private SslConfigurationResponse() {
        this.cert = null;
        this.cname = null;
        this.key = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cert;
        private @Nullable String cname;
        private @Nullable String key;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(SslConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cert = defaults.cert;
    	      this.cname = defaults.cname;
    	      this.key = defaults.key;
    	      this.status = defaults.status;
        }

        public Builder setCert(@Nullable String cert) {
            this.cert = cert;
            return this;
        }

        public Builder setCname(@Nullable String cname) {
            this.cname = cname;
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = key;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }
        public SslConfigurationResponse build() {
            return new SslConfigurationResponse(cert, cname, key, status);
        }
    }
}
