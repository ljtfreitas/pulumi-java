// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.enums.ServerBindingType;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServerBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerBindingArgs Empty = new ServerBindingArgs();

    @InputImport(name="type")
      private final @Nullable Input<ServerBindingType> type;

    public Input<ServerBindingType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ServerBindingArgs(@Nullable Input<ServerBindingType> type) {
        this.type = type;
    }

    private ServerBindingArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServerBindingType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(@Nullable Input<ServerBindingType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable ServerBindingType type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public ServerBindingArgs build() {
            return new ServerBindingArgs(type);
        }
    }
}
