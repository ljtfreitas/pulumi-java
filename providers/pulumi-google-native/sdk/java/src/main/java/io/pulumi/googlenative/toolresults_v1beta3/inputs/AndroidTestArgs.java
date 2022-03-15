// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.AndroidAppInfoArgs;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.AndroidInstrumentationTestArgs;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.AndroidRoboTestArgs;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.AndroidTestLoopArgs;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.DurationArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An Android mobile test specification.
 * 
 */
public final class AndroidTestArgs extends io.pulumi.resources.ResourceArgs {

    public static final AndroidTestArgs Empty = new AndroidTestArgs();

    /**
     * Information about the application under test.
     * 
     */
    @Import(name="androidAppInfo")
      private final @Nullable Output<AndroidAppInfoArgs> androidAppInfo;

    public Output<AndroidAppInfoArgs> getAndroidAppInfo() {
        return this.androidAppInfo == null ? Output.empty() : this.androidAppInfo;
    }

    /**
     * An Android instrumentation test.
     * 
     */
    @Import(name="androidInstrumentationTest")
      private final @Nullable Output<AndroidInstrumentationTestArgs> androidInstrumentationTest;

    public Output<AndroidInstrumentationTestArgs> getAndroidInstrumentationTest() {
        return this.androidInstrumentationTest == null ? Output.empty() : this.androidInstrumentationTest;
    }

    /**
     * An Android robo test.
     * 
     */
    @Import(name="androidRoboTest")
      private final @Nullable Output<AndroidRoboTestArgs> androidRoboTest;

    public Output<AndroidRoboTestArgs> getAndroidRoboTest() {
        return this.androidRoboTest == null ? Output.empty() : this.androidRoboTest;
    }

    /**
     * An Android test loop.
     * 
     */
    @Import(name="androidTestLoop")
      private final @Nullable Output<AndroidTestLoopArgs> androidTestLoop;

    public Output<AndroidTestLoopArgs> getAndroidTestLoop() {
        return this.androidTestLoop == null ? Output.empty() : this.androidTestLoop;
    }

    /**
     * Max time a test is allowed to run before it is automatically cancelled.
     * 
     */
    @Import(name="testTimeout")
      private final @Nullable Output<DurationArgs> testTimeout;

    public Output<DurationArgs> getTestTimeout() {
        return this.testTimeout == null ? Output.empty() : this.testTimeout;
    }

    public AndroidTestArgs(
        @Nullable Output<AndroidAppInfoArgs> androidAppInfo,
        @Nullable Output<AndroidInstrumentationTestArgs> androidInstrumentationTest,
        @Nullable Output<AndroidRoboTestArgs> androidRoboTest,
        @Nullable Output<AndroidTestLoopArgs> androidTestLoop,
        @Nullable Output<DurationArgs> testTimeout) {
        this.androidAppInfo = androidAppInfo;
        this.androidInstrumentationTest = androidInstrumentationTest;
        this.androidRoboTest = androidRoboTest;
        this.androidTestLoop = androidTestLoop;
        this.testTimeout = testTimeout;
    }

    private AndroidTestArgs() {
        this.androidAppInfo = Output.empty();
        this.androidInstrumentationTest = Output.empty();
        this.androidRoboTest = Output.empty();
        this.androidTestLoop = Output.empty();
        this.testTimeout = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AndroidTestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AndroidAppInfoArgs> androidAppInfo;
        private @Nullable Output<AndroidInstrumentationTestArgs> androidInstrumentationTest;
        private @Nullable Output<AndroidRoboTestArgs> androidRoboTest;
        private @Nullable Output<AndroidTestLoopArgs> androidTestLoop;
        private @Nullable Output<DurationArgs> testTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(AndroidTestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.androidAppInfo = defaults.androidAppInfo;
    	      this.androidInstrumentationTest = defaults.androidInstrumentationTest;
    	      this.androidRoboTest = defaults.androidRoboTest;
    	      this.androidTestLoop = defaults.androidTestLoop;
    	      this.testTimeout = defaults.testTimeout;
        }

        public Builder androidAppInfo(@Nullable Output<AndroidAppInfoArgs> androidAppInfo) {
            this.androidAppInfo = androidAppInfo;
            return this;
        }

        public Builder androidAppInfo(@Nullable AndroidAppInfoArgs androidAppInfo) {
            this.androidAppInfo = Output.ofNullable(androidAppInfo);
            return this;
        }

        public Builder androidInstrumentationTest(@Nullable Output<AndroidInstrumentationTestArgs> androidInstrumentationTest) {
            this.androidInstrumentationTest = androidInstrumentationTest;
            return this;
        }

        public Builder androidInstrumentationTest(@Nullable AndroidInstrumentationTestArgs androidInstrumentationTest) {
            this.androidInstrumentationTest = Output.ofNullable(androidInstrumentationTest);
            return this;
        }

        public Builder androidRoboTest(@Nullable Output<AndroidRoboTestArgs> androidRoboTest) {
            this.androidRoboTest = androidRoboTest;
            return this;
        }

        public Builder androidRoboTest(@Nullable AndroidRoboTestArgs androidRoboTest) {
            this.androidRoboTest = Output.ofNullable(androidRoboTest);
            return this;
        }

        public Builder androidTestLoop(@Nullable Output<AndroidTestLoopArgs> androidTestLoop) {
            this.androidTestLoop = androidTestLoop;
            return this;
        }

        public Builder androidTestLoop(@Nullable AndroidTestLoopArgs androidTestLoop) {
            this.androidTestLoop = Output.ofNullable(androidTestLoop);
            return this;
        }

        public Builder testTimeout(@Nullable Output<DurationArgs> testTimeout) {
            this.testTimeout = testTimeout;
            return this;
        }

        public Builder testTimeout(@Nullable DurationArgs testTimeout) {
            this.testTimeout = Output.ofNullable(testTimeout);
            return this;
        }
        public AndroidTestArgs build() {
            return new AndroidTestArgs(androidAppInfo, androidInstrumentationTest, androidRoboTest, androidTestLoop, testTimeout);
        }
    }
}
