// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.osconfig_v1beta.inputs.SoftwareRecipeStepCopyFileArgs;
import io.pulumi.googlenative.osconfig_v1beta.inputs.SoftwareRecipeStepExecFileArgs;
import io.pulumi.googlenative.osconfig_v1beta.inputs.SoftwareRecipeStepExtractArchiveArgs;
import io.pulumi.googlenative.osconfig_v1beta.inputs.SoftwareRecipeStepInstallDpkgArgs;
import io.pulumi.googlenative.osconfig_v1beta.inputs.SoftwareRecipeStepInstallMsiArgs;
import io.pulumi.googlenative.osconfig_v1beta.inputs.SoftwareRecipeStepInstallRpmArgs;
import io.pulumi.googlenative.osconfig_v1beta.inputs.SoftwareRecipeStepRunScriptArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An action that can be taken as part of installing or updating a recipe.
 * 
 */
public final class SoftwareRecipeStepArgs extends io.pulumi.resources.ResourceArgs {

    public static final SoftwareRecipeStepArgs Empty = new SoftwareRecipeStepArgs();

    /**
     * Extracts an archive into the specified directory.
     * 
     */
    @InputImport(name="archiveExtraction")
      private final @Nullable Input<SoftwareRecipeStepExtractArchiveArgs> archiveExtraction;

    public Input<SoftwareRecipeStepExtractArchiveArgs> getArchiveExtraction() {
        return this.archiveExtraction == null ? Input.empty() : this.archiveExtraction;
    }

    /**
     * Installs a deb file via dpkg.
     * 
     */
    @InputImport(name="dpkgInstallation")
      private final @Nullable Input<SoftwareRecipeStepInstallDpkgArgs> dpkgInstallation;

    public Input<SoftwareRecipeStepInstallDpkgArgs> getDpkgInstallation() {
        return this.dpkgInstallation == null ? Input.empty() : this.dpkgInstallation;
    }

    /**
     * Copies a file onto the instance.
     * 
     */
    @InputImport(name="fileCopy")
      private final @Nullable Input<SoftwareRecipeStepCopyFileArgs> fileCopy;

    public Input<SoftwareRecipeStepCopyFileArgs> getFileCopy() {
        return this.fileCopy == null ? Input.empty() : this.fileCopy;
    }

    /**
     * Executes an artifact or local file.
     * 
     */
    @InputImport(name="fileExec")
      private final @Nullable Input<SoftwareRecipeStepExecFileArgs> fileExec;

    public Input<SoftwareRecipeStepExecFileArgs> getFileExec() {
        return this.fileExec == null ? Input.empty() : this.fileExec;
    }

    /**
     * Installs an MSI file.
     * 
     */
    @InputImport(name="msiInstallation")
      private final @Nullable Input<SoftwareRecipeStepInstallMsiArgs> msiInstallation;

    public Input<SoftwareRecipeStepInstallMsiArgs> getMsiInstallation() {
        return this.msiInstallation == null ? Input.empty() : this.msiInstallation;
    }

    /**
     * Installs an rpm file via the rpm utility.
     * 
     */
    @InputImport(name="rpmInstallation")
      private final @Nullable Input<SoftwareRecipeStepInstallRpmArgs> rpmInstallation;

    public Input<SoftwareRecipeStepInstallRpmArgs> getRpmInstallation() {
        return this.rpmInstallation == null ? Input.empty() : this.rpmInstallation;
    }

    /**
     * Runs commands in a shell.
     * 
     */
    @InputImport(name="scriptRun")
      private final @Nullable Input<SoftwareRecipeStepRunScriptArgs> scriptRun;

    public Input<SoftwareRecipeStepRunScriptArgs> getScriptRun() {
        return this.scriptRun == null ? Input.empty() : this.scriptRun;
    }

    public SoftwareRecipeStepArgs(
        @Nullable Input<SoftwareRecipeStepExtractArchiveArgs> archiveExtraction,
        @Nullable Input<SoftwareRecipeStepInstallDpkgArgs> dpkgInstallation,
        @Nullable Input<SoftwareRecipeStepCopyFileArgs> fileCopy,
        @Nullable Input<SoftwareRecipeStepExecFileArgs> fileExec,
        @Nullable Input<SoftwareRecipeStepInstallMsiArgs> msiInstallation,
        @Nullable Input<SoftwareRecipeStepInstallRpmArgs> rpmInstallation,
        @Nullable Input<SoftwareRecipeStepRunScriptArgs> scriptRun) {
        this.archiveExtraction = archiveExtraction;
        this.dpkgInstallation = dpkgInstallation;
        this.fileCopy = fileCopy;
        this.fileExec = fileExec;
        this.msiInstallation = msiInstallation;
        this.rpmInstallation = rpmInstallation;
        this.scriptRun = scriptRun;
    }

    private SoftwareRecipeStepArgs() {
        this.archiveExtraction = Input.empty();
        this.dpkgInstallation = Input.empty();
        this.fileCopy = Input.empty();
        this.fileExec = Input.empty();
        this.msiInstallation = Input.empty();
        this.rpmInstallation = Input.empty();
        this.scriptRun = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareRecipeStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SoftwareRecipeStepExtractArchiveArgs> archiveExtraction;
        private @Nullable Input<SoftwareRecipeStepInstallDpkgArgs> dpkgInstallation;
        private @Nullable Input<SoftwareRecipeStepCopyFileArgs> fileCopy;
        private @Nullable Input<SoftwareRecipeStepExecFileArgs> fileExec;
        private @Nullable Input<SoftwareRecipeStepInstallMsiArgs> msiInstallation;
        private @Nullable Input<SoftwareRecipeStepInstallRpmArgs> rpmInstallation;
        private @Nullable Input<SoftwareRecipeStepRunScriptArgs> scriptRun;

        public Builder() {
    	      // Empty
        }

        public Builder(SoftwareRecipeStepArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveExtraction = defaults.archiveExtraction;
    	      this.dpkgInstallation = defaults.dpkgInstallation;
    	      this.fileCopy = defaults.fileCopy;
    	      this.fileExec = defaults.fileExec;
    	      this.msiInstallation = defaults.msiInstallation;
    	      this.rpmInstallation = defaults.rpmInstallation;
    	      this.scriptRun = defaults.scriptRun;
        }

        public Builder setArchiveExtraction(@Nullable Input<SoftwareRecipeStepExtractArchiveArgs> archiveExtraction) {
            this.archiveExtraction = archiveExtraction;
            return this;
        }

        public Builder setArchiveExtraction(@Nullable SoftwareRecipeStepExtractArchiveArgs archiveExtraction) {
            this.archiveExtraction = Input.ofNullable(archiveExtraction);
            return this;
        }

        public Builder setDpkgInstallation(@Nullable Input<SoftwareRecipeStepInstallDpkgArgs> dpkgInstallation) {
            this.dpkgInstallation = dpkgInstallation;
            return this;
        }

        public Builder setDpkgInstallation(@Nullable SoftwareRecipeStepInstallDpkgArgs dpkgInstallation) {
            this.dpkgInstallation = Input.ofNullable(dpkgInstallation);
            return this;
        }

        public Builder setFileCopy(@Nullable Input<SoftwareRecipeStepCopyFileArgs> fileCopy) {
            this.fileCopy = fileCopy;
            return this;
        }

        public Builder setFileCopy(@Nullable SoftwareRecipeStepCopyFileArgs fileCopy) {
            this.fileCopy = Input.ofNullable(fileCopy);
            return this;
        }

        public Builder setFileExec(@Nullable Input<SoftwareRecipeStepExecFileArgs> fileExec) {
            this.fileExec = fileExec;
            return this;
        }

        public Builder setFileExec(@Nullable SoftwareRecipeStepExecFileArgs fileExec) {
            this.fileExec = Input.ofNullable(fileExec);
            return this;
        }

        public Builder setMsiInstallation(@Nullable Input<SoftwareRecipeStepInstallMsiArgs> msiInstallation) {
            this.msiInstallation = msiInstallation;
            return this;
        }

        public Builder setMsiInstallation(@Nullable SoftwareRecipeStepInstallMsiArgs msiInstallation) {
            this.msiInstallation = Input.ofNullable(msiInstallation);
            return this;
        }

        public Builder setRpmInstallation(@Nullable Input<SoftwareRecipeStepInstallRpmArgs> rpmInstallation) {
            this.rpmInstallation = rpmInstallation;
            return this;
        }

        public Builder setRpmInstallation(@Nullable SoftwareRecipeStepInstallRpmArgs rpmInstallation) {
            this.rpmInstallation = Input.ofNullable(rpmInstallation);
            return this;
        }

        public Builder setScriptRun(@Nullable Input<SoftwareRecipeStepRunScriptArgs> scriptRun) {
            this.scriptRun = scriptRun;
            return this;
        }

        public Builder setScriptRun(@Nullable SoftwareRecipeStepRunScriptArgs scriptRun) {
            this.scriptRun = Input.ofNullable(scriptRun);
            return this;
        }
        public SoftwareRecipeStepArgs build() {
            return new SoftwareRecipeStepArgs(archiveExtraction, dpkgInstallation, fileCopy, fileExec, msiInstallation, rpmInstallation, scriptRun);
        }
    }
}
