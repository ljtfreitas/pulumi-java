// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.inputs.SyncPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties of the connected registry parent.
 * 
 */
public final class ParentPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ParentPropertiesArgs Empty = new ParentPropertiesArgs();

    /**
     * The resource ID of the parent to which the connected registry will be associated.
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * The sync properties of the connected registry with its parent.
     * 
     */
    @InputImport(name="syncProperties", required=true)
    private final Input<SyncPropertiesArgs> syncProperties;

    public Input<SyncPropertiesArgs> getSyncProperties() {
        return this.syncProperties;
    }

    public ParentPropertiesArgs(
        @Nullable Input<String> id,
        Input<SyncPropertiesArgs> syncProperties) {
        this.id = id;
        this.syncProperties = Objects.requireNonNull(syncProperties, "expected parameter 'syncProperties' to be non-null");
    }

    private ParentPropertiesArgs() {
        this.id = Input.empty();
        this.syncProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParentPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private Input<SyncPropertiesArgs> syncProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ParentPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.syncProperties = defaults.syncProperties;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setSyncProperties(Input<SyncPropertiesArgs> syncProperties) {
            this.syncProperties = Objects.requireNonNull(syncProperties);
            return this;
        }

        public Builder setSyncProperties(SyncPropertiesArgs syncProperties) {
            this.syncProperties = Input.of(Objects.requireNonNull(syncProperties));
            return this;
        }

        public ParentPropertiesArgs build() {
            return new ParentPropertiesArgs(id, syncProperties);
        }
    }
}
