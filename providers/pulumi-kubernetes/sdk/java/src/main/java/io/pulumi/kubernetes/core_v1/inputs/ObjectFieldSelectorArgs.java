// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ObjectFieldSelector selects an APIVersioned field of an object.
 * 
 */
public final class ObjectFieldSelectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectFieldSelectorArgs Empty = new ObjectFieldSelectorArgs();

    /**
     * Version of the schema the FieldPath is written in terms of, defaults to "v1".
     * 
     */
    @InputImport(name="apiVersion")
        private final @Nullable Input<String> apiVersion;

    public Input<String> getApiVersion() {
        return this.apiVersion == null ? Input.empty() : this.apiVersion;
    }

    /**
     * Path of the field to select in the specified API version.
     * 
     */
    @InputImport(name="fieldPath", required=true)
        private final Input<String> fieldPath;

    public Input<String> getFieldPath() {
        return this.fieldPath;
    }

    public ObjectFieldSelectorArgs(
        @Nullable Input<String> apiVersion,
        Input<String> fieldPath) {
        this.apiVersion = apiVersion;
        this.fieldPath = Objects.requireNonNull(fieldPath, "expected parameter 'fieldPath' to be non-null");
    }

    private ObjectFieldSelectorArgs() {
        this.apiVersion = Input.empty();
        this.fieldPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectFieldSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiVersion;
        private Input<String> fieldPath;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectFieldSelectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.fieldPath = defaults.fieldPath;
        }

        public Builder setApiVersion(@Nullable Input<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = Input.ofNullable(apiVersion);
            return this;
        }

        public Builder setFieldPath(Input<String> fieldPath) {
            this.fieldPath = Objects.requireNonNull(fieldPath);
            return this;
        }

        public Builder setFieldPath(String fieldPath) {
            this.fieldPath = Input.of(Objects.requireNonNull(fieldPath));
            return this;
        }
        public ObjectFieldSelectorArgs build() {
            return new ObjectFieldSelectorArgs(apiVersion, fieldPath);
        }
    }
}
