// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.synthetics.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CanaryBaseScreenshot extends io.pulumi.resources.InvokeArgs {

    public static final CanaryBaseScreenshot Empty = new CanaryBaseScreenshot();

    /**
     * List of coordinates of rectangles to be ignored during visual testing
     * 
     */
    @Import(name="ignoreCoordinates")
      private final @Nullable List<String> ignoreCoordinates;

    public List<String> getIgnoreCoordinates() {
        return this.ignoreCoordinates == null ? List.of() : this.ignoreCoordinates;
    }

    /**
     * Name of the screenshot to be used as base reference for visual testing
     * 
     */
    @Import(name="screenshotName", required=true)
      private final String screenshotName;

    public String getScreenshotName() {
        return this.screenshotName;
    }

    public CanaryBaseScreenshot(
        @Nullable List<String> ignoreCoordinates,
        String screenshotName) {
        this.ignoreCoordinates = ignoreCoordinates;
        this.screenshotName = Objects.requireNonNull(screenshotName, "expected parameter 'screenshotName' to be non-null");
    }

    private CanaryBaseScreenshot() {
        this.ignoreCoordinates = List.of();
        this.screenshotName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CanaryBaseScreenshot defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> ignoreCoordinates;
        private String screenshotName;

        public Builder() {
    	      // Empty
        }

        public Builder(CanaryBaseScreenshot defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreCoordinates = defaults.ignoreCoordinates;
    	      this.screenshotName = defaults.screenshotName;
        }

        public Builder ignoreCoordinates(@Nullable List<String> ignoreCoordinates) {
            this.ignoreCoordinates = ignoreCoordinates;
            return this;
        }

        public Builder screenshotName(String screenshotName) {
            this.screenshotName = Objects.requireNonNull(screenshotName);
            return this;
        }
        public CanaryBaseScreenshot build() {
            return new CanaryBaseScreenshot(ignoreCoordinates, screenshotName);
        }
    }
}
