// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.delegatednetwork.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of orchestrator
 * 
 */
public final class SubnetDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubnetDetailsArgs Empty = new SubnetDetailsArgs();

    /**
     * subnet arm resource id
     * 
     */
    @InputImport(name="id")
        private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    public SubnetDetailsArgs(@Nullable Input<String> id) {
        this.id = id;
    }

    private SubnetDetailsArgs() {
        this.id = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }
        public SubnetDetailsArgs build() {
            return new SubnetDetailsArgs(id);
        }
    }
}
