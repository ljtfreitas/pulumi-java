// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.inputs;

import io.pulumi.awsnative.customerprofiles.inputs.ObjectTypeFieldArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ObjectTypeFieldMapArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectTypeFieldMapArgs Empty = new ObjectTypeFieldMapArgs();

    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="objectTypeField")
        private final @Nullable Input<ObjectTypeFieldArgs> objectTypeField;

    public Input<ObjectTypeFieldArgs> getObjectTypeField() {
        return this.objectTypeField == null ? Input.empty() : this.objectTypeField;
    }

    public ObjectTypeFieldMapArgs(
        @Nullable Input<String> name,
        @Nullable Input<ObjectTypeFieldArgs> objectTypeField) {
        this.name = name;
        this.objectTypeField = objectTypeField;
    }

    private ObjectTypeFieldMapArgs() {
        this.name = Input.empty();
        this.objectTypeField = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectTypeFieldMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<ObjectTypeFieldArgs> objectTypeField;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectTypeFieldMapArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.objectTypeField = defaults.objectTypeField;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setObjectTypeField(@Nullable Input<ObjectTypeFieldArgs> objectTypeField) {
            this.objectTypeField = objectTypeField;
            return this;
        }

        public Builder setObjectTypeField(@Nullable ObjectTypeFieldArgs objectTypeField) {
            this.objectTypeField = Input.ofNullable(objectTypeField);
            return this;
        }
        public ObjectTypeFieldMapArgs build() {
            return new ObjectTypeFieldMapArgs(name, objectTypeField);
        }
    }
}
