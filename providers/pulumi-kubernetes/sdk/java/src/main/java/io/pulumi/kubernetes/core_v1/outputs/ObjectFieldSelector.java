// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ObjectFieldSelector {
    /**
     * Version of the schema the FieldPath is written in terms of, defaults to "v1".
     * 
     */
    private final @Nullable String apiVersion;
    /**
     * Path of the field to select in the specified API version.
     * 
     */
    private final String fieldPath;

    @OutputCustomType.Constructor({"apiVersion","fieldPath"})
    private ObjectFieldSelector(
        @Nullable String apiVersion,
        String fieldPath) {
        this.apiVersion = apiVersion;
        this.fieldPath = Objects.requireNonNull(fieldPath);
    }

    /**
     * Version of the schema the FieldPath is written in terms of, defaults to "v1".
     * 
     */
    public Optional<String> getApiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * Path of the field to select in the specified API version.
     * 
     */
    public String getFieldPath() {
        return this.fieldPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectFieldSelector defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiVersion;
        private String fieldPath;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectFieldSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.fieldPath = defaults.fieldPath;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setFieldPath(String fieldPath) {
            this.fieldPath = Objects.requireNonNull(fieldPath);
            return this;
        }
        public ObjectFieldSelector build() {
            return new ObjectFieldSelector(apiVersion, fieldPath);
        }
    }
}
