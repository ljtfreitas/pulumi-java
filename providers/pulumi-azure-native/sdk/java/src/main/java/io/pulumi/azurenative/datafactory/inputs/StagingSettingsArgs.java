// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Staging settings.
 * 
 */
public final class StagingSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final StagingSettingsArgs Empty = new StagingSettingsArgs();

    /**
     * Specifies whether to use compression when copying data via an interim staging. Default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="enableCompression")
      private final @Nullable Output<Object> enableCompression;

    public Output<Object> getEnableCompression() {
        return this.enableCompression == null ? Output.empty() : this.enableCompression;
    }

    /**
     * Staging linked service reference.
     * 
     */
    @Import(name="linkedServiceName", required=true)
      private final Output<LinkedServiceReferenceArgs> linkedServiceName;

    public Output<LinkedServiceReferenceArgs> getLinkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * The path to storage for storing the interim data. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="path")
      private final @Nullable Output<Object> path;

    public Output<Object> getPath() {
        return this.path == null ? Output.empty() : this.path;
    }

    public StagingSettingsArgs(
        @Nullable Output<Object> enableCompression,
        Output<LinkedServiceReferenceArgs> linkedServiceName,
        @Nullable Output<Object> path) {
        this.enableCompression = enableCompression;
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
        this.path = path;
    }

    private StagingSettingsArgs() {
        this.enableCompression = Output.empty();
        this.linkedServiceName = Output.empty();
        this.path = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StagingSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> enableCompression;
        private Output<LinkedServiceReferenceArgs> linkedServiceName;
        private @Nullable Output<Object> path;

        public Builder() {
    	      // Empty
        }

        public Builder(StagingSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableCompression = defaults.enableCompression;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.path = defaults.path;
        }

        public Builder enableCompression(@Nullable Output<Object> enableCompression) {
            this.enableCompression = enableCompression;
            return this;
        }

        public Builder enableCompression(@Nullable Object enableCompression) {
            this.enableCompression = Output.ofNullable(enableCompression);
            return this;
        }

        public Builder linkedServiceName(Output<LinkedServiceReferenceArgs> linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }

        public Builder linkedServiceName(LinkedServiceReferenceArgs linkedServiceName) {
            this.linkedServiceName = Output.of(Objects.requireNonNull(linkedServiceName));
            return this;
        }

        public Builder path(@Nullable Output<Object> path) {
            this.path = path;
            return this;
        }

        public Builder path(@Nullable Object path) {
            this.path = Output.ofNullable(path);
            return this;
        }
        public StagingSettingsArgs build() {
            return new StagingSettingsArgs(enableCompression, linkedServiceName, path);
        }
    }
}
