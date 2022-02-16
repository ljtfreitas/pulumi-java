// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.recaptcha;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.recaptcha.inputs.EnterpriseKeyAndroidSettingsArgs;
import io.pulumi.gcp.recaptcha.inputs.EnterpriseKeyIosSettingsArgs;
import io.pulumi.gcp.recaptcha.inputs.EnterpriseKeyTestingOptionsArgs;
import io.pulumi.gcp.recaptcha.inputs.EnterpriseKeyWebSettingsArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnterpriseKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnterpriseKeyArgs Empty = new EnterpriseKeyArgs();

    @InputImport(name="androidSettings")
    private final @Nullable Input<EnterpriseKeyAndroidSettingsArgs> androidSettings;

    public Input<EnterpriseKeyAndroidSettingsArgs> getAndroidSettings() {
        return this.androidSettings == null ? Input.empty() : this.androidSettings;
    }

    @InputImport(name="displayName", required=true)
    private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    @InputImport(name="iosSettings")
    private final @Nullable Input<EnterpriseKeyIosSettingsArgs> iosSettings;

    public Input<EnterpriseKeyIosSettingsArgs> getIosSettings() {
        return this.iosSettings == null ? Input.empty() : this.iosSettings;
    }

    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="testingOptions")
    private final @Nullable Input<EnterpriseKeyTestingOptionsArgs> testingOptions;

    public Input<EnterpriseKeyTestingOptionsArgs> getTestingOptions() {
        return this.testingOptions == null ? Input.empty() : this.testingOptions;
    }

    @InputImport(name="webSettings")
    private final @Nullable Input<EnterpriseKeyWebSettingsArgs> webSettings;

    public Input<EnterpriseKeyWebSettingsArgs> getWebSettings() {
        return this.webSettings == null ? Input.empty() : this.webSettings;
    }

    public EnterpriseKeyArgs(
        @Nullable Input<EnterpriseKeyAndroidSettingsArgs> androidSettings,
        Input<String> displayName,
        @Nullable Input<EnterpriseKeyIosSettingsArgs> iosSettings,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> project,
        @Nullable Input<EnterpriseKeyTestingOptionsArgs> testingOptions,
        @Nullable Input<EnterpriseKeyWebSettingsArgs> webSettings) {
        this.androidSettings = androidSettings;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.iosSettings = iosSettings;
        this.labels = labels;
        this.project = project;
        this.testingOptions = testingOptions;
        this.webSettings = webSettings;
    }

    private EnterpriseKeyArgs() {
        this.androidSettings = Input.empty();
        this.displayName = Input.empty();
        this.iosSettings = Input.empty();
        this.labels = Input.empty();
        this.project = Input.empty();
        this.testingOptions = Input.empty();
        this.webSettings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EnterpriseKeyAndroidSettingsArgs> androidSettings;
        private Input<String> displayName;
        private @Nullable Input<EnterpriseKeyIosSettingsArgs> iosSettings;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> project;
        private @Nullable Input<EnterpriseKeyTestingOptionsArgs> testingOptions;
        private @Nullable Input<EnterpriseKeyWebSettingsArgs> webSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterpriseKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.androidSettings = defaults.androidSettings;
    	      this.displayName = defaults.displayName;
    	      this.iosSettings = defaults.iosSettings;
    	      this.labels = defaults.labels;
    	      this.project = defaults.project;
    	      this.testingOptions = defaults.testingOptions;
    	      this.webSettings = defaults.webSettings;
        }

        public Builder setAndroidSettings(@Nullable Input<EnterpriseKeyAndroidSettingsArgs> androidSettings) {
            this.androidSettings = androidSettings;
            return this;
        }

        public Builder setAndroidSettings(@Nullable EnterpriseKeyAndroidSettingsArgs androidSettings) {
            this.androidSettings = Input.ofNullable(androidSettings);
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setIosSettings(@Nullable Input<EnterpriseKeyIosSettingsArgs> iosSettings) {
            this.iosSettings = iosSettings;
            return this;
        }

        public Builder setIosSettings(@Nullable EnterpriseKeyIosSettingsArgs iosSettings) {
            this.iosSettings = Input.ofNullable(iosSettings);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setTestingOptions(@Nullable Input<EnterpriseKeyTestingOptionsArgs> testingOptions) {
            this.testingOptions = testingOptions;
            return this;
        }

        public Builder setTestingOptions(@Nullable EnterpriseKeyTestingOptionsArgs testingOptions) {
            this.testingOptions = Input.ofNullable(testingOptions);
            return this;
        }

        public Builder setWebSettings(@Nullable Input<EnterpriseKeyWebSettingsArgs> webSettings) {
            this.webSettings = webSettings;
            return this;
        }

        public Builder setWebSettings(@Nullable EnterpriseKeyWebSettingsArgs webSettings) {
            this.webSettings = Input.ofNullable(webSettings);
            return this;
        }

        public EnterpriseKeyArgs build() {
            return new EnterpriseKeyArgs(androidSettings, displayName, iosSettings, labels, project, testingOptions, webSettings);
        }
    }
}