// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.greengrassv2.inputs;

import io.pulumi.awsnative.greengrassv2.enums.ComponentVersionLambdaFilesystemPermission;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ComponentVersionLambdaVolumeMountArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComponentVersionLambdaVolumeMountArgs Empty = new ComponentVersionLambdaVolumeMountArgs();

    @Import(name="addGroupOwner")
      private final @Nullable Output<Boolean> addGroupOwner;

    public Output<Boolean> getAddGroupOwner() {
        return this.addGroupOwner == null ? Output.empty() : this.addGroupOwner;
    }

    @Import(name="destinationPath")
      private final @Nullable Output<String> destinationPath;

    public Output<String> getDestinationPath() {
        return this.destinationPath == null ? Output.empty() : this.destinationPath;
    }

    @Import(name="permission")
      private final @Nullable Output<ComponentVersionLambdaFilesystemPermission> permission;

    public Output<ComponentVersionLambdaFilesystemPermission> getPermission() {
        return this.permission == null ? Output.empty() : this.permission;
    }

    @Import(name="sourcePath")
      private final @Nullable Output<String> sourcePath;

    public Output<String> getSourcePath() {
        return this.sourcePath == null ? Output.empty() : this.sourcePath;
    }

    public ComponentVersionLambdaVolumeMountArgs(
        @Nullable Output<Boolean> addGroupOwner,
        @Nullable Output<String> destinationPath,
        @Nullable Output<ComponentVersionLambdaFilesystemPermission> permission,
        @Nullable Output<String> sourcePath) {
        this.addGroupOwner = addGroupOwner;
        this.destinationPath = destinationPath;
        this.permission = permission;
        this.sourcePath = sourcePath;
    }

    private ComponentVersionLambdaVolumeMountArgs() {
        this.addGroupOwner = Output.empty();
        this.destinationPath = Output.empty();
        this.permission = Output.empty();
        this.sourcePath = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentVersionLambdaVolumeMountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> addGroupOwner;
        private @Nullable Output<String> destinationPath;
        private @Nullable Output<ComponentVersionLambdaFilesystemPermission> permission;
        private @Nullable Output<String> sourcePath;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentVersionLambdaVolumeMountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addGroupOwner = defaults.addGroupOwner;
    	      this.destinationPath = defaults.destinationPath;
    	      this.permission = defaults.permission;
    	      this.sourcePath = defaults.sourcePath;
        }

        public Builder addGroupOwner(@Nullable Output<Boolean> addGroupOwner) {
            this.addGroupOwner = addGroupOwner;
            return this;
        }

        public Builder addGroupOwner(@Nullable Boolean addGroupOwner) {
            this.addGroupOwner = Output.ofNullable(addGroupOwner);
            return this;
        }

        public Builder destinationPath(@Nullable Output<String> destinationPath) {
            this.destinationPath = destinationPath;
            return this;
        }

        public Builder destinationPath(@Nullable String destinationPath) {
            this.destinationPath = Output.ofNullable(destinationPath);
            return this;
        }

        public Builder permission(@Nullable Output<ComponentVersionLambdaFilesystemPermission> permission) {
            this.permission = permission;
            return this;
        }

        public Builder permission(@Nullable ComponentVersionLambdaFilesystemPermission permission) {
            this.permission = Output.ofNullable(permission);
            return this;
        }

        public Builder sourcePath(@Nullable Output<String> sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }

        public Builder sourcePath(@Nullable String sourcePath) {
            this.sourcePath = Output.ofNullable(sourcePath);
            return this;
        }
        public ComponentVersionLambdaVolumeMountArgs build() {
            return new ComponentVersionLambdaVolumeMountArgs(addGroupOwner, destinationPath, permission, sourcePath);
        }
    }
}
