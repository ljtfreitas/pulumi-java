// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.secretmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecretVersionState extends io.pulumi.resources.ResourceArgs {

    public static final SecretVersionState Empty = new SecretVersionState();

    /**
     * The time at which the Secret was created.
     * 
     */
    @InputImport(name="createTime")
        private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    /**
     * The time at which the Secret was destroyed. Only present if state is DESTROYED.
     * 
     */
    @InputImport(name="destroyTime")
        private final @Nullable Input<String> destroyTime;

    public Input<String> getDestroyTime() {
        return this.destroyTime == null ? Input.empty() : this.destroyTime;
    }

    /**
     * The current state of the SecretVersion.
     * 
     */
    @InputImport(name="enabled")
        private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * The resource name of the SecretVersion. Format: 'projects/{{project}}/secrets/{{secret_id}}/versions/{{version}}'
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Secret Manager secret resource
     * 
     */
    @InputImport(name="secret")
        private final @Nullable Input<String> secret;

    public Input<String> getSecret() {
        return this.secret == null ? Input.empty() : this.secret;
    }

    /**
     * The secret data. Must be no larger than 64KiB.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @InputImport(name="secretData")
        private final @Nullable Input<String> secretData;

    public Input<String> getSecretData() {
        return this.secretData == null ? Input.empty() : this.secretData;
    }

    public SecretVersionState(
        @Nullable Input<String> createTime,
        @Nullable Input<String> destroyTime,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<String> name,
        @Nullable Input<String> secret,
        @Nullable Input<String> secretData) {
        this.createTime = createTime;
        this.destroyTime = destroyTime;
        this.enabled = enabled;
        this.name = name;
        this.secret = secret;
        this.secretData = secretData;
    }

    private SecretVersionState() {
        this.createTime = Input.empty();
        this.destroyTime = Input.empty();
        this.enabled = Input.empty();
        this.name = Input.empty();
        this.secret = Input.empty();
        this.secretData = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretVersionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> destroyTime;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<String> name;
        private @Nullable Input<String> secret;
        private @Nullable Input<String> secretData;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretVersionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.destroyTime = defaults.destroyTime;
    	      this.enabled = defaults.enabled;
    	      this.name = defaults.name;
    	      this.secret = defaults.secret;
    	      this.secretData = defaults.secretData;
        }

        public Builder setCreateTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
            return this;
        }

        public Builder setDestroyTime(@Nullable Input<String> destroyTime) {
            this.destroyTime = destroyTime;
            return this;
        }

        public Builder setDestroyTime(@Nullable String destroyTime) {
            this.destroyTime = Input.ofNullable(destroyTime);
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setSecret(@Nullable Input<String> secret) {
            this.secret = secret;
            return this;
        }

        public Builder setSecret(@Nullable String secret) {
            this.secret = Input.ofNullable(secret);
            return this;
        }

        public Builder setSecretData(@Nullable Input<String> secretData) {
            this.secretData = secretData;
            return this;
        }

        public Builder setSecretData(@Nullable String secretData) {
            this.secretData = Input.ofNullable(secretData);
            return this;
        }
        public SecretVersionState build() {
            return new SecretVersionState(createTime, destroyTime, enabled, name, secret, secretData);
        }
    }
}
