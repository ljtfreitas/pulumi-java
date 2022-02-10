// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CustomImagePropertiesCustomResponse {
    private final @Nullable String imageName;
    private final String osType;
    private final @Nullable Boolean sysPrep;

    @OutputCustomType.Constructor({"imageName","osType","sysPrep"})
    private CustomImagePropertiesCustomResponse(
        @Nullable String imageName,
        String osType,
        @Nullable Boolean sysPrep) {
        this.imageName = imageName;
        this.osType = Objects.requireNonNull(osType);
        this.sysPrep = sysPrep;
    }

    public Optional<String> getImageName() {
        return Optional.ofNullable(this.imageName);
    }
    public String getOsType() {
        return this.osType;
    }
    public Optional<Boolean> getSysPrep() {
        return Optional.ofNullable(this.sysPrep);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomImagePropertiesCustomResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String imageName;
        private String osType;
        private @Nullable Boolean sysPrep;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomImagePropertiesCustomResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageName = defaults.imageName;
    	      this.osType = defaults.osType;
    	      this.sysPrep = defaults.sysPrep;
        }

        public Builder setImageName(@Nullable String imageName) {
            this.imageName = imageName;
            return this;
        }

        public Builder setOsType(String osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }

        public Builder setSysPrep(@Nullable Boolean sysPrep) {
            this.sysPrep = sysPrep;
            return this;
        }

        public CustomImagePropertiesCustomResponse build() {
            return new CustomImagePropertiesCustomResponse(imageName, osType, sysPrep);
        }
    }
}