// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KeyPairArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyPairArgs Empty = new KeyPairArgs();

    /**
     * The name for the key pair.
     * 
     */
    @InputImport(name="keyName")
    private final @Nullable Input<String> keyName;

    public Input<String> getKeyName() {
        return this.keyName == null ? Input.empty() : this.keyName;
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `key_name`.
     * 
     */
    @InputImport(name="keyNamePrefix")
    private final @Nullable Input<String> keyNamePrefix;

    public Input<String> getKeyNamePrefix() {
        return this.keyNamePrefix == null ? Input.empty() : this.keyNamePrefix;
    }

    /**
     * The public key material.
     * 
     */
    @InputImport(name="publicKey", required=true)
    private final Input<String> publicKey;

    public Input<String> getPublicKey() {
        return this.publicKey;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public KeyPairArgs(
        @Nullable Input<String> keyName,
        @Nullable Input<String> keyNamePrefix,
        Input<String> publicKey,
        @Nullable Input<Map<String,String>> tags) {
        this.keyName = keyName;
        this.keyNamePrefix = keyNamePrefix;
        this.publicKey = Objects.requireNonNull(publicKey, "expected parameter 'publicKey' to be non-null");
        this.tags = tags;
    }

    private KeyPairArgs() {
        this.keyName = Input.empty();
        this.keyNamePrefix = Input.empty();
        this.publicKey = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyPairArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> keyName;
        private @Nullable Input<String> keyNamePrefix;
        private Input<String> publicKey;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyPairArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.keyNamePrefix = defaults.keyNamePrefix;
    	      this.publicKey = defaults.publicKey;
    	      this.tags = defaults.tags;
        }

        public Builder setKeyName(@Nullable Input<String> keyName) {
            this.keyName = keyName;
            return this;
        }

        public Builder setKeyName(@Nullable String keyName) {
            this.keyName = Input.ofNullable(keyName);
            return this;
        }

        public Builder setKeyNamePrefix(@Nullable Input<String> keyNamePrefix) {
            this.keyNamePrefix = keyNamePrefix;
            return this;
        }

        public Builder setKeyNamePrefix(@Nullable String keyNamePrefix) {
            this.keyNamePrefix = Input.ofNullable(keyNamePrefix);
            return this;
        }

        public Builder setPublicKey(Input<String> publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }

        public Builder setPublicKey(String publicKey) {
            this.publicKey = Input.of(Objects.requireNonNull(publicKey));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public KeyPairArgs build() {
            return new KeyPairArgs(keyName, keyNamePrefix, publicKey, tags);
        }
    }
}
