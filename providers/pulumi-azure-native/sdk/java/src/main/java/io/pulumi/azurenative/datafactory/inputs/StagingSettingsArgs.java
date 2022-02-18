// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="enableCompression")
    private final @Nullable Input<Object> enableCompression;

    public Input<Object> getEnableCompression() {
        return this.enableCompression == null ? Input.empty() : this.enableCompression;
    }

    /**
     * Staging linked service reference.
     * 
     */
    @InputImport(name="linkedServiceName", required=true)
    private final Input<LinkedServiceReferenceArgs> linkedServiceName;

    public Input<LinkedServiceReferenceArgs> getLinkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * The path to storage for storing the interim data. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="path")
    private final @Nullable Input<Object> path;

    public Input<Object> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    public StagingSettingsArgs(
        @Nullable Input<Object> enableCompression,
        Input<LinkedServiceReferenceArgs> linkedServiceName,
        @Nullable Input<Object> path) {
        this.enableCompression = enableCompression;
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
        this.path = path;
    }

    private StagingSettingsArgs() {
        this.enableCompression = Input.empty();
        this.linkedServiceName = Input.empty();
        this.path = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StagingSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> enableCompression;
        private Input<LinkedServiceReferenceArgs> linkedServiceName;
        private @Nullable Input<Object> path;

        public Builder() {
    	      // Empty
        }

        public Builder(StagingSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableCompression = defaults.enableCompression;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.path = defaults.path;
        }

        public Builder setEnableCompression(@Nullable Input<Object> enableCompression) {
            this.enableCompression = enableCompression;
            return this;
        }

        public Builder setEnableCompression(@Nullable Object enableCompression) {
            this.enableCompression = Input.ofNullable(enableCompression);
            return this;
        }

        public Builder setLinkedServiceName(Input<LinkedServiceReferenceArgs> linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }

        public Builder setLinkedServiceName(LinkedServiceReferenceArgs linkedServiceName) {
            this.linkedServiceName = Input.of(Objects.requireNonNull(linkedServiceName));
            return this;
        }

        public Builder setPath(@Nullable Input<Object> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable Object path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public StagingSettingsArgs build() {
            return new StagingSettingsArgs(enableCompression, linkedServiceName, path);
        }
    }
}
