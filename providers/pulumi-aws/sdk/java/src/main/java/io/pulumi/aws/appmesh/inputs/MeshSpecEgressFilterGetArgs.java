// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MeshSpecEgressFilterGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MeshSpecEgressFilterGetArgs Empty = new MeshSpecEgressFilterGetArgs();

    /**
     * The egress filter type. By default, the type is `DROP_ALL`.
     * Valid values are `ALLOW_ALL` and `DROP_ALL`.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public MeshSpecEgressFilterGetArgs(@Nullable Input<String> type) {
        this.type = type;
    }

    private MeshSpecEgressFilterGetArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MeshSpecEgressFilterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(MeshSpecEgressFilterGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public MeshSpecEgressFilterGetArgs build() {
            return new MeshSpecEgressFilterGetArgs(type);
        }
    }
}
