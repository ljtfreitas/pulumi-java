// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dns_v1beta2.inputs.RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configures a RRSetRoutingPolicy that routes in a weighted round robin fashion.
 * 
 */
public final class RRSetRoutingPolicyWrrPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RRSetRoutingPolicyWrrPolicyArgs Empty = new RRSetRoutingPolicyWrrPolicyArgs();

    @InputImport(name="items")
      private final @Nullable Input<List<RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs>> items;

    public Input<List<RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs>> getItems() {
        return this.items == null ? Input.empty() : this.items;
    }

    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    public RRSetRoutingPolicyWrrPolicyArgs(
        @Nullable Input<List<RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs>> items,
        @Nullable Input<String> kind) {
        this.items = items;
        this.kind = kind;
    }

    private RRSetRoutingPolicyWrrPolicyArgs() {
        this.items = Input.empty();
        this.kind = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RRSetRoutingPolicyWrrPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs>> items;
        private @Nullable Input<String> kind;

        public Builder() {
    	      // Empty
        }

        public Builder(RRSetRoutingPolicyWrrPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
    	      this.kind = defaults.kind;
        }

        public Builder setItems(@Nullable Input<List<RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs>> items) {
            this.items = items;
            return this;
        }

        public Builder setItems(@Nullable List<RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs> items) {
            this.items = Input.ofNullable(items);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }
        public RRSetRoutingPolicyWrrPolicyArgs build() {
            return new RRSetRoutingPolicyWrrPolicyArgs(items, kind);
        }
    }
}
