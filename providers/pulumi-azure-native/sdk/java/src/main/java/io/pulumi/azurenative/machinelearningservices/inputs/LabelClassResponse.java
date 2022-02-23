// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a label or a category of labels in a labeling job.
 * 
 */
public final class LabelClassResponse extends io.pulumi.resources.InvokeArgs {

    public static final LabelClassResponse Empty = new LabelClassResponse();

    /**
     * Display name of the label class.
     * 
     */
    @InputImport(name="displayName")
        private final @Nullable String displayName;

    public Optional<String> getDisplayName() {
        return this.displayName == null ? Optional.empty() : Optional.ofNullable(this.displayName);
    }

    /**
     * Dictionary of subclasses of the label class.
     * 
     */
    @InputImport(name="subclasses")
        private final @Nullable Map<String,LabelClassResponse> subclasses;

    public Map<String,LabelClassResponse> getSubclasses() {
        return this.subclasses == null ? Map.of() : this.subclasses;
    }

    public LabelClassResponse(
        @Nullable String displayName,
        @Nullable Map<String,LabelClassResponse> subclasses) {
        this.displayName = displayName;
        this.subclasses = subclasses;
    }

    private LabelClassResponse() {
        this.displayName = null;
        this.subclasses = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabelClassResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private @Nullable Map<String,LabelClassResponse> subclasses;

        public Builder() {
    	      // Empty
        }

        public Builder(LabelClassResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.subclasses = defaults.subclasses;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setSubclasses(@Nullable Map<String,LabelClassResponse> subclasses) {
            this.subclasses = subclasses;
            return this;
        }
        public LabelClassResponse build() {
            return new LabelClassResponse(displayName, subclasses);
        }
    }
}
