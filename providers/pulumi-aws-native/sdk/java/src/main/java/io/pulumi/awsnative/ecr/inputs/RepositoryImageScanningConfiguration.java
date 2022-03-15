// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecr.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The image scanning configuration for the repository. This setting determines whether images are scanned for known vulnerabilities after being pushed to the repository.
 * 
 */
public final class RepositoryImageScanningConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final RepositoryImageScanningConfiguration Empty = new RepositoryImageScanningConfiguration();

    @Import(name="scanOnPush")
      private final @Nullable Boolean scanOnPush;

    public Optional<Boolean> getScanOnPush() {
        return this.scanOnPush == null ? Optional.empty() : Optional.ofNullable(this.scanOnPush);
    }

    public RepositoryImageScanningConfiguration(@Nullable Boolean scanOnPush) {
        this.scanOnPush = scanOnPush;
    }

    private RepositoryImageScanningConfiguration() {
        this.scanOnPush = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryImageScanningConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean scanOnPush;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryImageScanningConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scanOnPush = defaults.scanOnPush;
        }

        public Builder scanOnPush(@Nullable Boolean scanOnPush) {
            this.scanOnPush = scanOnPush;
            return this;
        }
        public RepositoryImageScanningConfiguration build() {
            return new RepositoryImageScanningConfiguration(scanOnPush);
        }
    }
}
