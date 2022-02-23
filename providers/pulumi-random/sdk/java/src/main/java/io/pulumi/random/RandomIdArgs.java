// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.random;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RandomIdArgs extends io.pulumi.resources.ResourceArgs {

    public static final RandomIdArgs Empty = new RandomIdArgs();

    /**
     * The number of random bytes to produce. The minimum value is 1, which produces eight bits of randomness.
     * 
     */
    @InputImport(name="byteLength", required=true)
        private final Input<Integer> byteLength;

    public Input<Integer> getByteLength() {
        return this.byteLength;
    }

    /**
     * Arbitrary map of values that, when changed, will trigger recreation of resource. See the main provider documentation for more information.
     * 
     */
    @InputImport(name="keepers")
        private final @Nullable Input<Map<String,Object>> keepers;

    public Input<Map<String,Object>> getKeepers() {
        return this.keepers == null ? Input.empty() : this.keepers;
    }

    /**
     * Arbitrary string to prefix the output value with. This string is supplied as-is, meaning it is not guaranteed to be URL-safe or base64 encoded.
     * 
     */
    @InputImport(name="prefix")
        private final @Nullable Input<String> prefix;

    public Input<String> getPrefix() {
        return this.prefix == null ? Input.empty() : this.prefix;
    }

    public RandomIdArgs(
        Input<Integer> byteLength,
        @Nullable Input<Map<String,Object>> keepers,
        @Nullable Input<String> prefix) {
        this.byteLength = Objects.requireNonNull(byteLength, "expected parameter 'byteLength' to be non-null");
        this.keepers = keepers;
        this.prefix = prefix;
    }

    private RandomIdArgs() {
        this.byteLength = Input.empty();
        this.keepers = Input.empty();
        this.prefix = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RandomIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> byteLength;
        private @Nullable Input<Map<String,Object>> keepers;
        private @Nullable Input<String> prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(RandomIdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.byteLength = defaults.byteLength;
    	      this.keepers = defaults.keepers;
    	      this.prefix = defaults.prefix;
        }

        public Builder setByteLength(Input<Integer> byteLength) {
            this.byteLength = Objects.requireNonNull(byteLength);
            return this;
        }

        public Builder setByteLength(Integer byteLength) {
            this.byteLength = Input.of(Objects.requireNonNull(byteLength));
            return this;
        }

        public Builder setKeepers(@Nullable Input<Map<String,Object>> keepers) {
            this.keepers = keepers;
            return this;
        }

        public Builder setKeepers(@Nullable Map<String,Object> keepers) {
            this.keepers = Input.ofNullable(keepers);
            return this;
        }

        public Builder setPrefix(@Nullable Input<String> prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = Input.ofNullable(prefix);
            return this;
        }
        public RandomIdArgs build() {
            return new RandomIdArgs(byteLength, keepers, prefix);
        }
    }
}
