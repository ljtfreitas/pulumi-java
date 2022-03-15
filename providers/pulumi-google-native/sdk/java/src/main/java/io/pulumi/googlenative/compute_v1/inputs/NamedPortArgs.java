// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The named port. For example: <"http", 80>.
 * 
 */
public final class NamedPortArgs extends io.pulumi.resources.ResourceArgs {

    public static final NamedPortArgs Empty = new NamedPortArgs();

    /**
     * The name for this named port. The name must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The port number, which can be a value between 1 and 65535.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port == null ? Output.empty() : this.port;
    }

    public NamedPortArgs(
        @Nullable Output<String> name,
        @Nullable Output<Integer> port) {
        this.name = name;
        this.port = port;
    }

    private NamedPortArgs() {
        this.name = Output.empty();
        this.port = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamedPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> port;

        public Builder() {
    	      // Empty
        }

        public Builder(NamedPortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.port = defaults.port;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder port(@Nullable Integer port) {
            this.port = Output.ofNullable(port);
            return this;
        }
        public NamedPortArgs build() {
            return new NamedPortArgs(name, port);
        }
    }
}
