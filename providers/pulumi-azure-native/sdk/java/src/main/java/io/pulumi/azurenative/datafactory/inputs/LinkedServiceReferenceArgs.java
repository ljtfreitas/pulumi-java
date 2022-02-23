// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Linked service reference type.
 * 
 */
public final class LinkedServiceReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final LinkedServiceReferenceArgs Empty = new LinkedServiceReferenceArgs();

    /**
     * Arguments for LinkedService.
     * 
     */
    @InputImport(name="parameters")
        private final @Nullable Input<Map<String,Object>> parameters;

    public Input<Map<String,Object>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * Reference LinkedService name.
     * 
     */
    @InputImport(name="referenceName", required=true)
        private final Input<String> referenceName;

    public Input<String> getReferenceName() {
        return this.referenceName;
    }

    /**
     * Linked service reference type.
     * 
     */
    @InputImport(name="type", required=true)
        private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public LinkedServiceReferenceArgs(
        @Nullable Input<Map<String,Object>> parameters,
        Input<String> referenceName,
        Input<String> type) {
        this.parameters = parameters;
        this.referenceName = Objects.requireNonNull(referenceName, "expected parameter 'referenceName' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private LinkedServiceReferenceArgs() {
        this.parameters = Input.empty();
        this.referenceName = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedServiceReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,Object>> parameters;
        private Input<String> referenceName;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedServiceReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
    	      this.referenceName = defaults.referenceName;
    	      this.type = defaults.type;
        }

        public Builder setParameters(@Nullable Input<Map<String,Object>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,Object> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setReferenceName(Input<String> referenceName) {
            this.referenceName = Objects.requireNonNull(referenceName);
            return this;
        }

        public Builder setReferenceName(String referenceName) {
            this.referenceName = Input.of(Objects.requireNonNull(referenceName));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public LinkedServiceReferenceArgs build() {
            return new LinkedServiceReferenceArgs(parameters, referenceName, type);
        }
    }
}
