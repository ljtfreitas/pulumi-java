// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recaptchaenterprise_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.recaptchaenterprise_v1.outputs.GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse;
import io.pulumi.googlenative.recaptchaenterprise_v1.outputs.GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse;
import io.pulumi.googlenative.recaptchaenterprise_v1.outputs.GoogleCloudRecaptchaenterpriseV1TestingOptionsResponse;
import io.pulumi.googlenative.recaptchaenterprise_v1.outputs.GoogleCloudRecaptchaenterpriseV1WafSettingsResponse;
import io.pulumi.googlenative.recaptchaenterprise_v1.outputs.GoogleCloudRecaptchaenterpriseV1WebKeySettingsResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetKeyResult {
    /**
     * Settings for keys that can be used by Android apps.
     * 
     */
    private final GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse androidSettings;
    /**
     * The timestamp corresponding to the creation of this Key.
     * 
     */
    private final String createTime;
    /**
     * Human-readable display name of this key. Modifiable by user.
     * 
     */
    private final String displayName;
    /**
     * Settings for keys that can be used by iOS apps.
     * 
     */
    private final GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse iosSettings;
    /**
     * See Creating and managing labels.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The resource name for the Key in the format "projects/{project}/keys/{key}".
     * 
     */
    private final String name;
    /**
     * Options for user acceptance testing.
     * 
     */
    private final GoogleCloudRecaptchaenterpriseV1TestingOptionsResponse testingOptions;
    /**
     * Settings for WAF
     * 
     */
    private final GoogleCloudRecaptchaenterpriseV1WafSettingsResponse wafSettings;
    /**
     * Settings for keys that can be used by websites.
     * 
     */
    private final GoogleCloudRecaptchaenterpriseV1WebKeySettingsResponse webSettings;

    @CustomType.Constructor
    private GetKeyResult(
        @CustomType.Parameter("androidSettings") GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse androidSettings,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("iosSettings") GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse iosSettings,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("testingOptions") GoogleCloudRecaptchaenterpriseV1TestingOptionsResponse testingOptions,
        @CustomType.Parameter("wafSettings") GoogleCloudRecaptchaenterpriseV1WafSettingsResponse wafSettings,
        @CustomType.Parameter("webSettings") GoogleCloudRecaptchaenterpriseV1WebKeySettingsResponse webSettings) {
        this.androidSettings = androidSettings;
        this.createTime = createTime;
        this.displayName = displayName;
        this.iosSettings = iosSettings;
        this.labels = labels;
        this.name = name;
        this.testingOptions = testingOptions;
        this.wafSettings = wafSettings;
        this.webSettings = webSettings;
    }

    /**
     * Settings for keys that can be used by Android apps.
     * 
    */
    public GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse getAndroidSettings() {
        return this.androidSettings;
    }
    /**
     * The timestamp corresponding to the creation of this Key.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Human-readable display name of this key. Modifiable by user.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Settings for keys that can be used by iOS apps.
     * 
    */
    public GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse getIosSettings() {
        return this.iosSettings;
    }
    /**
     * See Creating and managing labels.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The resource name for the Key in the format "projects/{project}/keys/{key}".
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Options for user acceptance testing.
     * 
    */
    public GoogleCloudRecaptchaenterpriseV1TestingOptionsResponse getTestingOptions() {
        return this.testingOptions;
    }
    /**
     * Settings for WAF
     * 
    */
    public GoogleCloudRecaptchaenterpriseV1WafSettingsResponse getWafSettings() {
        return this.wafSettings;
    }
    /**
     * Settings for keys that can be used by websites.
     * 
    */
    public GoogleCloudRecaptchaenterpriseV1WebKeySettingsResponse getWebSettings() {
        return this.webSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse androidSettings;
        private String createTime;
        private String displayName;
        private GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse iosSettings;
        private Map<String,String> labels;
        private String name;
        private GoogleCloudRecaptchaenterpriseV1TestingOptionsResponse testingOptions;
        private GoogleCloudRecaptchaenterpriseV1WafSettingsResponse wafSettings;
        private GoogleCloudRecaptchaenterpriseV1WebKeySettingsResponse webSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.androidSettings = defaults.androidSettings;
    	      this.createTime = defaults.createTime;
    	      this.displayName = defaults.displayName;
    	      this.iosSettings = defaults.iosSettings;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.testingOptions = defaults.testingOptions;
    	      this.wafSettings = defaults.wafSettings;
    	      this.webSettings = defaults.webSettings;
        }

        public Builder androidSettings(GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse androidSettings) {
            this.androidSettings = Objects.requireNonNull(androidSettings);
            return this;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder iosSettings(GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse iosSettings) {
            this.iosSettings = Objects.requireNonNull(iosSettings);
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder testingOptions(GoogleCloudRecaptchaenterpriseV1TestingOptionsResponse testingOptions) {
            this.testingOptions = Objects.requireNonNull(testingOptions);
            return this;
        }

        public Builder wafSettings(GoogleCloudRecaptchaenterpriseV1WafSettingsResponse wafSettings) {
            this.wafSettings = Objects.requireNonNull(wafSettings);
            return this;
        }

        public Builder webSettings(GoogleCloudRecaptchaenterpriseV1WebKeySettingsResponse webSettings) {
            this.webSettings = Objects.requireNonNull(webSettings);
            return this;
        }
        public GetKeyResult build() {
            return new GetKeyResult(androidSettings, createTime, displayName, iosSettings, labels, name, testingOptions, wafSettings, webSettings);
        }
    }
}
