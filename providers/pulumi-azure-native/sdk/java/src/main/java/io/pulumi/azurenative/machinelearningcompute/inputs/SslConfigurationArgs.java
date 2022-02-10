// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.inputs;

import io.pulumi.azurenative.machinelearningcompute.enums.Status;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SslConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SslConfigurationArgs Empty = new SslConfigurationArgs();

    @InputImport(name="cert")
    private final @Nullable Input<String> cert;

    public Input<String> getCert() {
        return this.cert == null ? Input.empty() : this.cert;
    }

    @InputImport(name="cname")
    private final @Nullable Input<String> cname;

    public Input<String> getCname() {
        return this.cname == null ? Input.empty() : this.cname;
    }

    @InputImport(name="key")
    private final @Nullable Input<String> key;

    public Input<String> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    @InputImport(name="status")
    private final @Nullable Input<Either<String,Status>> status;

    public Input<Either<String,Status>> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public SslConfigurationArgs(
        @Nullable Input<String> cert,
        @Nullable Input<String> cname,
        @Nullable Input<String> key,
        @Nullable Input<Either<String,Status>> status) {
        this.cert = cert;
        this.cname = cname;
        this.key = key;
        this.status = status == null ? Input.ofLeft("Enabled") : status;
    }

    private SslConfigurationArgs() {
        this.cert = Input.empty();
        this.cname = Input.empty();
        this.key = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cert;
        private @Nullable Input<String> cname;
        private @Nullable Input<String> key;
        private @Nullable Input<Either<String,Status>> status;

        public Builder() {
    	      // Empty
        }

        public Builder(SslConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cert = defaults.cert;
    	      this.cname = defaults.cname;
    	      this.key = defaults.key;
    	      this.status = defaults.status;
        }

        public Builder setCert(@Nullable Input<String> cert) {
            this.cert = cert;
            return this;
        }

        public Builder setCert(@Nullable String cert) {
            this.cert = Input.ofNullable(cert);
            return this;
        }

        public Builder setCname(@Nullable Input<String> cname) {
            this.cname = cname;
            return this;
        }

        public Builder setCname(@Nullable String cname) {
            this.cname = Input.ofNullable(cname);
            return this;
        }

        public Builder setKey(@Nullable Input<String> key) {
            this.key = key;
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = Input.ofNullable(key);
            return this;
        }

        public Builder setStatus(@Nullable Input<Either<String,Status>> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable Either<String,Status> status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public SslConfigurationArgs build() {
            return new SslConfigurationArgs(cert, cname, key, status);
        }
    }
}