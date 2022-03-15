// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.AndroidTestArgs;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.IosTestArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The details about how to run the execution.
 * 
 */
public final class SpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpecificationArgs Empty = new SpecificationArgs();

    /**
     * An Android mobile test execution specification.
     * 
     */
    @Import(name="androidTest")
      private final @Nullable Output<AndroidTestArgs> androidTest;

    public Output<AndroidTestArgs> getAndroidTest() {
        return this.androidTest == null ? Output.empty() : this.androidTest;
    }

    /**
     * An iOS mobile test execution specification.
     * 
     */
    @Import(name="iosTest")
      private final @Nullable Output<IosTestArgs> iosTest;

    public Output<IosTestArgs> getIosTest() {
        return this.iosTest == null ? Output.empty() : this.iosTest;
    }

    public SpecificationArgs(
        @Nullable Output<AndroidTestArgs> androidTest,
        @Nullable Output<IosTestArgs> iosTest) {
        this.androidTest = androidTest;
        this.iosTest = iosTest;
    }

    private SpecificationArgs() {
        this.androidTest = Output.empty();
        this.iosTest = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AndroidTestArgs> androidTest;
        private @Nullable Output<IosTestArgs> iosTest;

        public Builder() {
    	      // Empty
        }

        public Builder(SpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.androidTest = defaults.androidTest;
    	      this.iosTest = defaults.iosTest;
        }

        public Builder androidTest(@Nullable Output<AndroidTestArgs> androidTest) {
            this.androidTest = androidTest;
            return this;
        }

        public Builder androidTest(@Nullable AndroidTestArgs androidTest) {
            this.androidTest = Output.ofNullable(androidTest);
            return this;
        }

        public Builder iosTest(@Nullable Output<IosTestArgs> iosTest) {
            this.iosTest = iosTest;
            return this;
        }

        public Builder iosTest(@Nullable IosTestArgs iosTest) {
            this.iosTest = Output.ofNullable(iosTest);
            return this;
        }
        public SpecificationArgs build() {
            return new SpecificationArgs(androidTest, iosTest);
        }
    }
}
