// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2DeidentifyConfigResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDeidentifyTemplateResult {
    /**
     * The creation timestamp of an inspectTemplate.
     * 
     */
    private final String createTime;
    /**
     * The core content of the template.
     * 
     */
    private final GooglePrivacyDlpV2DeidentifyConfigResponse deidentifyConfig;
    /**
     * Short description (max 256 chars).
     * 
     */
    private final String description;
    /**
     * Display name (max 256 chars).
     * 
     */
    private final String displayName;
    /**
     * The template name. The template will have one of the following formats: `projects/PROJECT_ID/deidentifyTemplates/TEMPLATE_ID` OR `organizations/ORGANIZATION_ID/deidentifyTemplates/TEMPLATE_ID`
     * 
     */
    private final String name;
    /**
     * The last update timestamp of an inspectTemplate.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetDeidentifyTemplateResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("deidentifyConfig") GooglePrivacyDlpV2DeidentifyConfigResponse deidentifyConfig,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.deidentifyConfig = deidentifyConfig;
        this.description = description;
        this.displayName = displayName;
        this.name = name;
        this.updateTime = updateTime;
    }

    /**
     * The creation timestamp of an inspectTemplate.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The core content of the template.
     * 
    */
    public GooglePrivacyDlpV2DeidentifyConfigResponse getDeidentifyConfig() {
        return this.deidentifyConfig;
    }
    /**
     * Short description (max 256 chars).
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Display name (max 256 chars).
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The template name. The template will have one of the following formats: `projects/PROJECT_ID/deidentifyTemplates/TEMPLATE_ID` OR `organizations/ORGANIZATION_ID/deidentifyTemplates/TEMPLATE_ID`
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The last update timestamp of an inspectTemplate.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeidentifyTemplateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private GooglePrivacyDlpV2DeidentifyConfigResponse deidentifyConfig;
        private String description;
        private String displayName;
        private String name;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeidentifyTemplateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.deidentifyConfig = defaults.deidentifyConfig;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder deidentifyConfig(GooglePrivacyDlpV2DeidentifyConfigResponse deidentifyConfig) {
            this.deidentifyConfig = Objects.requireNonNull(deidentifyConfig);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetDeidentifyTemplateResult build() {
            return new GetDeidentifyTemplateResult(createTime, deidentifyConfig, description, displayName, name, updateTime);
        }
    }
}
