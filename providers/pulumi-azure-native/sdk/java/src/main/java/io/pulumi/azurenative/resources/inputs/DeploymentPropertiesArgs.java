// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.inputs;

import io.pulumi.azurenative.resources.enums.DeploymentMode;
import io.pulumi.azurenative.resources.inputs.DebugSettingArgs;
import io.pulumi.azurenative.resources.inputs.ExpressionEvaluationOptionsArgs;
import io.pulumi.azurenative.resources.inputs.OnErrorDeploymentArgs;
import io.pulumi.azurenative.resources.inputs.ParametersLinkArgs;
import io.pulumi.azurenative.resources.inputs.TemplateLinkArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Deployment properties.
 * 
 */
public final class DeploymentPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentPropertiesArgs Empty = new DeploymentPropertiesArgs();

    /**
     * The debug setting of the deployment.
     * 
     */
    @InputImport(name="debugSetting")
        private final @Nullable Input<DebugSettingArgs> debugSetting;

    public Input<DebugSettingArgs> getDebugSetting() {
        return this.debugSetting == null ? Input.empty() : this.debugSetting;
    }

    /**
     * Specifies whether template expressions are evaluated within the scope of the parent template or nested template. Only applicable to nested templates. If not specified, default value is outer.
     * 
     */
    @InputImport(name="expressionEvaluationOptions")
        private final @Nullable Input<ExpressionEvaluationOptionsArgs> expressionEvaluationOptions;

    public Input<ExpressionEvaluationOptionsArgs> getExpressionEvaluationOptions() {
        return this.expressionEvaluationOptions == null ? Input.empty() : this.expressionEvaluationOptions;
    }

    /**
     * The mode that is used to deploy resources. This value can be either Incremental or Complete. In Incremental mode, resources are deployed without deleting existing resources that are not included in the template. In Complete mode, resources are deployed and existing resources in the resource group that are not included in the template are deleted. Be careful when using Complete mode as you may unintentionally delete resources.
     * 
     */
    @InputImport(name="mode", required=true)
        private final Input<DeploymentMode> mode;

    public Input<DeploymentMode> getMode() {
        return this.mode;
    }

    /**
     * The deployment on error behavior.
     * 
     */
    @InputImport(name="onErrorDeployment")
        private final @Nullable Input<OnErrorDeploymentArgs> onErrorDeployment;

    public Input<OnErrorDeploymentArgs> getOnErrorDeployment() {
        return this.onErrorDeployment == null ? Input.empty() : this.onErrorDeployment;
    }

    /**
     * Name and value pairs that define the deployment parameters for the template. You use this element when you want to provide the parameter values directly in the request rather than link to an existing parameter file. Use either the parametersLink property or the parameters property, but not both. It can be a JObject or a well formed JSON string.
     * 
     */
    @InputImport(name="parameters")
        private final @Nullable Input<Object> parameters;

    public Input<Object> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * The URI of parameters file. You use this element to link to an existing parameters file. Use either the parametersLink property or the parameters property, but not both.
     * 
     */
    @InputImport(name="parametersLink")
        private final @Nullable Input<ParametersLinkArgs> parametersLink;

    public Input<ParametersLinkArgs> getParametersLink() {
        return this.parametersLink == null ? Input.empty() : this.parametersLink;
    }

    /**
     * The template content. You use this element when you want to pass the template syntax directly in the request rather than link to an existing template. It can be a JObject or well-formed JSON string. Use either the templateLink property or the template property, but not both.
     * 
     */
    @InputImport(name="template")
        private final @Nullable Input<Object> template;

    public Input<Object> getTemplate() {
        return this.template == null ? Input.empty() : this.template;
    }

    /**
     * The URI of the template. Use either the templateLink property or the template property, but not both.
     * 
     */
    @InputImport(name="templateLink")
        private final @Nullable Input<TemplateLinkArgs> templateLink;

    public Input<TemplateLinkArgs> getTemplateLink() {
        return this.templateLink == null ? Input.empty() : this.templateLink;
    }

    public DeploymentPropertiesArgs(
        @Nullable Input<DebugSettingArgs> debugSetting,
        @Nullable Input<ExpressionEvaluationOptionsArgs> expressionEvaluationOptions,
        Input<DeploymentMode> mode,
        @Nullable Input<OnErrorDeploymentArgs> onErrorDeployment,
        @Nullable Input<Object> parameters,
        @Nullable Input<ParametersLinkArgs> parametersLink,
        @Nullable Input<Object> template,
        @Nullable Input<TemplateLinkArgs> templateLink) {
        this.debugSetting = debugSetting;
        this.expressionEvaluationOptions = expressionEvaluationOptions;
        this.mode = Objects.requireNonNull(mode, "expected parameter 'mode' to be non-null");
        this.onErrorDeployment = onErrorDeployment;
        this.parameters = parameters;
        this.parametersLink = parametersLink;
        this.template = template;
        this.templateLink = templateLink;
    }

    private DeploymentPropertiesArgs() {
        this.debugSetting = Input.empty();
        this.expressionEvaluationOptions = Input.empty();
        this.mode = Input.empty();
        this.onErrorDeployment = Input.empty();
        this.parameters = Input.empty();
        this.parametersLink = Input.empty();
        this.template = Input.empty();
        this.templateLink = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DebugSettingArgs> debugSetting;
        private @Nullable Input<ExpressionEvaluationOptionsArgs> expressionEvaluationOptions;
        private Input<DeploymentMode> mode;
        private @Nullable Input<OnErrorDeploymentArgs> onErrorDeployment;
        private @Nullable Input<Object> parameters;
        private @Nullable Input<ParametersLinkArgs> parametersLink;
        private @Nullable Input<Object> template;
        private @Nullable Input<TemplateLinkArgs> templateLink;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.debugSetting = defaults.debugSetting;
    	      this.expressionEvaluationOptions = defaults.expressionEvaluationOptions;
    	      this.mode = defaults.mode;
    	      this.onErrorDeployment = defaults.onErrorDeployment;
    	      this.parameters = defaults.parameters;
    	      this.parametersLink = defaults.parametersLink;
    	      this.template = defaults.template;
    	      this.templateLink = defaults.templateLink;
        }

        public Builder setDebugSetting(@Nullable Input<DebugSettingArgs> debugSetting) {
            this.debugSetting = debugSetting;
            return this;
        }

        public Builder setDebugSetting(@Nullable DebugSettingArgs debugSetting) {
            this.debugSetting = Input.ofNullable(debugSetting);
            return this;
        }

        public Builder setExpressionEvaluationOptions(@Nullable Input<ExpressionEvaluationOptionsArgs> expressionEvaluationOptions) {
            this.expressionEvaluationOptions = expressionEvaluationOptions;
            return this;
        }

        public Builder setExpressionEvaluationOptions(@Nullable ExpressionEvaluationOptionsArgs expressionEvaluationOptions) {
            this.expressionEvaluationOptions = Input.ofNullable(expressionEvaluationOptions);
            return this;
        }

        public Builder setMode(Input<DeploymentMode> mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder setMode(DeploymentMode mode) {
            this.mode = Input.of(Objects.requireNonNull(mode));
            return this;
        }

        public Builder setOnErrorDeployment(@Nullable Input<OnErrorDeploymentArgs> onErrorDeployment) {
            this.onErrorDeployment = onErrorDeployment;
            return this;
        }

        public Builder setOnErrorDeployment(@Nullable OnErrorDeploymentArgs onErrorDeployment) {
            this.onErrorDeployment = Input.ofNullable(onErrorDeployment);
            return this;
        }

        public Builder setParameters(@Nullable Input<Object> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable Object parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setParametersLink(@Nullable Input<ParametersLinkArgs> parametersLink) {
            this.parametersLink = parametersLink;
            return this;
        }

        public Builder setParametersLink(@Nullable ParametersLinkArgs parametersLink) {
            this.parametersLink = Input.ofNullable(parametersLink);
            return this;
        }

        public Builder setTemplate(@Nullable Input<Object> template) {
            this.template = template;
            return this;
        }

        public Builder setTemplate(@Nullable Object template) {
            this.template = Input.ofNullable(template);
            return this;
        }

        public Builder setTemplateLink(@Nullable Input<TemplateLinkArgs> templateLink) {
            this.templateLink = templateLink;
            return this;
        }

        public Builder setTemplateLink(@Nullable TemplateLinkArgs templateLink) {
            this.templateLink = Input.ofNullable(templateLink);
            return this;
        }
        public DeploymentPropertiesArgs build() {
            return new DeploymentPropertiesArgs(debugSetting, expressionEvaluationOptions, mode, onErrorDeployment, parameters, parametersLink, template, templateLink);
        }
    }
}
