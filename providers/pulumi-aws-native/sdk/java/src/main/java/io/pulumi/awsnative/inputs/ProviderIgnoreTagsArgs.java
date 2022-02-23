// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration with resource tag settings to ignore across all resources handled by this provider (except any individual service tag resources such as `ec2.Tag`) for situations where external systems are managing certain resource tags.
 * 
 */
public final class ProviderIgnoreTagsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProviderIgnoreTagsArgs Empty = new ProviderIgnoreTagsArgs();

    /**
     * List of exact resource tag keys to ignore across all resources handled by this provider. This configuration prevents Pulumi from returning the tag in any `tags` attributes and displaying any configuration difference for the tag value. If any resource configuration still has this tag key configured in the `tags` argument, it will display a perpetual difference until the tag is removed from the argument or `ignoreChanges` is also used.
     * 
     */
    @InputImport(name="keyPrefixes")
        private final @Nullable Input<List<String>> keyPrefixes;

    public Input<List<String>> getKeyPrefixes() {
        return this.keyPrefixes == null ? Input.empty() : this.keyPrefixes;
    }

    /**
     * List of resource tag key prefixes to ignore across all resources handled by this provider. This configuration prevents Pulumi from returning any tag key matching the prefixes in any `tags` attributes and displaying any configuration difference for those tag values. If any resource configuration still has a tag matching one of the prefixes configured in the `tags` argument, it will display a perpetual difference until the tag is removed from the argument or `ignoreChanges` is also used.
     * 
     */
    @InputImport(name="keys")
        private final @Nullable Input<List<String>> keys;

    public Input<List<String>> getKeys() {
        return this.keys == null ? Input.empty() : this.keys;
    }

    public ProviderIgnoreTagsArgs(
        @Nullable Input<List<String>> keyPrefixes,
        @Nullable Input<List<String>> keys) {
        this.keyPrefixes = keyPrefixes;
        this.keys = keys;
    }

    private ProviderIgnoreTagsArgs() {
        this.keyPrefixes = Input.empty();
        this.keys = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderIgnoreTagsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> keyPrefixes;
        private @Nullable Input<List<String>> keys;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderIgnoreTagsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyPrefixes = defaults.keyPrefixes;
    	      this.keys = defaults.keys;
        }

        public Builder setKeyPrefixes(@Nullable Input<List<String>> keyPrefixes) {
            this.keyPrefixes = keyPrefixes;
            return this;
        }

        public Builder setKeyPrefixes(@Nullable List<String> keyPrefixes) {
            this.keyPrefixes = Input.ofNullable(keyPrefixes);
            return this;
        }

        public Builder setKeys(@Nullable Input<List<String>> keys) {
            this.keys = keys;
            return this;
        }

        public Builder setKeys(@Nullable List<String> keys) {
            this.keys = Input.ofNullable(keys);
            return this;
        }
        public ProviderIgnoreTagsArgs build() {
            return new ProviderIgnoreTagsArgs(keyPrefixes, keys);
        }
    }
}
