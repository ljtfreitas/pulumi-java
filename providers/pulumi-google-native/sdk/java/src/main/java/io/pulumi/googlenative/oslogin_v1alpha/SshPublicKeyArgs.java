// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.oslogin_v1alpha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SshPublicKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SshPublicKeyArgs Empty = new SshPublicKeyArgs();

    /**
     * An expiration time in microseconds since epoch.
     * 
     */
    @Import(name="expirationTimeUsec")
      private final @Nullable Output<String> expirationTimeUsec;

    public Output<String> getExpirationTimeUsec() {
        return this.expirationTimeUsec == null ? Output.empty() : this.expirationTimeUsec;
    }

    /**
     * Public key text in SSH format, defined by RFC4253 section 6.6.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> getKey() {
        return this.key == null ? Output.empty() : this.key;
    }

    @Import(name="userId", required=true)
      private final Output<String> userId;

    public Output<String> getUserId() {
        return this.userId;
    }

    public SshPublicKeyArgs(
        @Nullable Output<String> expirationTimeUsec,
        @Nullable Output<String> key,
        Output<String> userId) {
        this.expirationTimeUsec = expirationTimeUsec;
        this.key = key;
        this.userId = Objects.requireNonNull(userId, "expected parameter 'userId' to be non-null");
    }

    private SshPublicKeyArgs() {
        this.expirationTimeUsec = Output.empty();
        this.key = Output.empty();
        this.userId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SshPublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> expirationTimeUsec;
        private @Nullable Output<String> key;
        private Output<String> userId;

        public Builder() {
    	      // Empty
        }

        public Builder(SshPublicKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationTimeUsec = defaults.expirationTimeUsec;
    	      this.key = defaults.key;
    	      this.userId = defaults.userId;
        }

        public Builder expirationTimeUsec(@Nullable Output<String> expirationTimeUsec) {
            this.expirationTimeUsec = expirationTimeUsec;
            return this;
        }

        public Builder expirationTimeUsec(@Nullable String expirationTimeUsec) {
            this.expirationTimeUsec = Output.ofNullable(expirationTimeUsec);
            return this;
        }

        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }

        public Builder key(@Nullable String key) {
            this.key = Output.ofNullable(key);
            return this;
        }

        public Builder userId(Output<String> userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }

        public Builder userId(String userId) {
            this.userId = Output.of(Objects.requireNonNull(userId));
            return this;
        }
        public SshPublicKeyArgs build() {
            return new SshPublicKeyArgs(expirationTimeUsec, key, userId);
        }
    }
}
