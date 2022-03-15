// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouterMd5AuthenticationKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouterMd5AuthenticationKeyArgs Empty = new RouterMd5AuthenticationKeyArgs();

    /**
     * [Input only] Value of the key. For patch and update calls, it can be skipped to copy the value from the previous configuration. This is allowed if the key with the same name existed before the operation. Maximum length is 80 characters. Can only contain printable ASCII characters.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> getKey() {
        return this.key == null ? Output.empty() : this.key;
    }

    /**
     * Name used to identify the key. Must be unique within a router. Must be referenced by at least one bgpPeer. Must comply with RFC1035.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public RouterMd5AuthenticationKeyArgs(
        @Nullable Output<String> key,
        @Nullable Output<String> name) {
        this.key = key;
        this.name = name;
    }

    private RouterMd5AuthenticationKeyArgs() {
        this.key = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterMd5AuthenticationKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> key;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterMd5AuthenticationKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.name = defaults.name;
        }

        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }

        public Builder key(@Nullable String key) {
            this.key = Output.ofNullable(key);
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
        public RouterMd5AuthenticationKeyArgs build() {
            return new RouterMd5AuthenticationKeyArgs(key, name);
        }
    }
}
