// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppFunctionArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppFunctionArgs Empty = new WebAppFunctionArgs();

    /**
     * Config information.
     * 
     */
    @InputImport(name="config")
    private final @Nullable Input<Object> config;

    public Input<Object> getConfig() {
        return this.config == null ? Input.empty() : this.config;
    }

    /**
     * Config URI.
     * 
     */
    @InputImport(name="configHref")
    private final @Nullable Input<String> configHref;

    public Input<String> getConfigHref() {
        return this.configHref == null ? Input.empty() : this.configHref;
    }

    /**
     * File list.
     * 
     */
    @InputImport(name="files")
    private final @Nullable Input<Map<String,String>> files;

    public Input<Map<String,String>> getFiles() {
        return this.files == null ? Input.empty() : this.files;
    }

    /**
     * Function App ID.
     * 
     */
    @InputImport(name="functionAppId")
    private final @Nullable Input<String> functionAppId;

    public Input<String> getFunctionAppId() {
        return this.functionAppId == null ? Input.empty() : this.functionAppId;
    }

    /**
     * Function name.
     * 
     */
    @InputImport(name="functionName")
    private final @Nullable Input<String> functionName;

    public Input<String> getFunctionName() {
        return this.functionName == null ? Input.empty() : this.functionName;
    }

    /**
     * Function URI.
     * 
     */
    @InputImport(name="href")
    private final @Nullable Input<String> href;

    public Input<String> getHref() {
        return this.href == null ? Input.empty() : this.href;
    }

    /**
     * The invocation URL
     * 
     */
    @InputImport(name="invokeUrlTemplate")
    private final @Nullable Input<String> invokeUrlTemplate;

    public Input<String> getInvokeUrlTemplate() {
        return this.invokeUrlTemplate == null ? Input.empty() : this.invokeUrlTemplate;
    }

    /**
     * Gets or sets a value indicating whether the function is disabled
     * 
     */
    @InputImport(name="isDisabled")
    private final @Nullable Input<Boolean> isDisabled;

    public Input<Boolean> getIsDisabled() {
        return this.isDisabled == null ? Input.empty() : this.isDisabled;
    }

    /**
     * Kind of resource.
     * 
     */
    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * The function language
     * 
     */
    @InputImport(name="language")
    private final @Nullable Input<String> language;

    public Input<String> getLanguage() {
        return this.language == null ? Input.empty() : this.language;
    }

    /**
     * Site name.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Script URI.
     * 
     */
    @InputImport(name="scriptHref")
    private final @Nullable Input<String> scriptHref;

    public Input<String> getScriptHref() {
        return this.scriptHref == null ? Input.empty() : this.scriptHref;
    }

    /**
     * Script root path URI.
     * 
     */
    @InputImport(name="scriptRootPathHref")
    private final @Nullable Input<String> scriptRootPathHref;

    public Input<String> getScriptRootPathHref() {
        return this.scriptRootPathHref == null ? Input.empty() : this.scriptRootPathHref;
    }

    /**
     * Secrets file URI.
     * 
     */
    @InputImport(name="secretsFileHref")
    private final @Nullable Input<String> secretsFileHref;

    public Input<String> getSecretsFileHref() {
        return this.secretsFileHref == null ? Input.empty() : this.secretsFileHref;
    }

    /**
     * Test data used when testing via the Azure Portal.
     * 
     */
    @InputImport(name="testData")
    private final @Nullable Input<String> testData;

    public Input<String> getTestData() {
        return this.testData == null ? Input.empty() : this.testData;
    }

    /**
     * Test data URI.
     * 
     */
    @InputImport(name="testDataHref")
    private final @Nullable Input<String> testDataHref;

    public Input<String> getTestDataHref() {
        return this.testDataHref == null ? Input.empty() : this.testDataHref;
    }

    public WebAppFunctionArgs(
        @Nullable Input<Object> config,
        @Nullable Input<String> configHref,
        @Nullable Input<Map<String,String>> files,
        @Nullable Input<String> functionAppId,
        @Nullable Input<String> functionName,
        @Nullable Input<String> href,
        @Nullable Input<String> invokeUrlTemplate,
        @Nullable Input<Boolean> isDisabled,
        @Nullable Input<String> kind,
        @Nullable Input<String> language,
        Input<String> name,
        Input<String> resourceGroupName,
        @Nullable Input<String> scriptHref,
        @Nullable Input<String> scriptRootPathHref,
        @Nullable Input<String> secretsFileHref,
        @Nullable Input<String> testData,
        @Nullable Input<String> testDataHref) {
        this.config = config;
        this.configHref = configHref;
        this.files = files;
        this.functionAppId = functionAppId;
        this.functionName = functionName;
        this.href = href;
        this.invokeUrlTemplate = invokeUrlTemplate;
        this.isDisabled = isDisabled;
        this.kind = kind;
        this.language = language;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scriptHref = scriptHref;
        this.scriptRootPathHref = scriptRootPathHref;
        this.secretsFileHref = secretsFileHref;
        this.testData = testData;
        this.testDataHref = testDataHref;
    }

    private WebAppFunctionArgs() {
        this.config = Input.empty();
        this.configHref = Input.empty();
        this.files = Input.empty();
        this.functionAppId = Input.empty();
        this.functionName = Input.empty();
        this.href = Input.empty();
        this.invokeUrlTemplate = Input.empty();
        this.isDisabled = Input.empty();
        this.kind = Input.empty();
        this.language = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.scriptHref = Input.empty();
        this.scriptRootPathHref = Input.empty();
        this.secretsFileHref = Input.empty();
        this.testData = Input.empty();
        this.testDataHref = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppFunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> config;
        private @Nullable Input<String> configHref;
        private @Nullable Input<Map<String,String>> files;
        private @Nullable Input<String> functionAppId;
        private @Nullable Input<String> functionName;
        private @Nullable Input<String> href;
        private @Nullable Input<String> invokeUrlTemplate;
        private @Nullable Input<Boolean> isDisabled;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> language;
        private Input<String> name;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> scriptHref;
        private @Nullable Input<String> scriptRootPathHref;
        private @Nullable Input<String> secretsFileHref;
        private @Nullable Input<String> testData;
        private @Nullable Input<String> testDataHref;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppFunctionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.configHref = defaults.configHref;
    	      this.files = defaults.files;
    	      this.functionAppId = defaults.functionAppId;
    	      this.functionName = defaults.functionName;
    	      this.href = defaults.href;
    	      this.invokeUrlTemplate = defaults.invokeUrlTemplate;
    	      this.isDisabled = defaults.isDisabled;
    	      this.kind = defaults.kind;
    	      this.language = defaults.language;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scriptHref = defaults.scriptHref;
    	      this.scriptRootPathHref = defaults.scriptRootPathHref;
    	      this.secretsFileHref = defaults.secretsFileHref;
    	      this.testData = defaults.testData;
    	      this.testDataHref = defaults.testDataHref;
        }

        public Builder setConfig(@Nullable Input<Object> config) {
            this.config = config;
            return this;
        }

        public Builder setConfig(@Nullable Object config) {
            this.config = Input.ofNullable(config);
            return this;
        }

        public Builder setConfigHref(@Nullable Input<String> configHref) {
            this.configHref = configHref;
            return this;
        }

        public Builder setConfigHref(@Nullable String configHref) {
            this.configHref = Input.ofNullable(configHref);
            return this;
        }

        public Builder setFiles(@Nullable Input<Map<String,String>> files) {
            this.files = files;
            return this;
        }

        public Builder setFiles(@Nullable Map<String,String> files) {
            this.files = Input.ofNullable(files);
            return this;
        }

        public Builder setFunctionAppId(@Nullable Input<String> functionAppId) {
            this.functionAppId = functionAppId;
            return this;
        }

        public Builder setFunctionAppId(@Nullable String functionAppId) {
            this.functionAppId = Input.ofNullable(functionAppId);
            return this;
        }

        public Builder setFunctionName(@Nullable Input<String> functionName) {
            this.functionName = functionName;
            return this;
        }

        public Builder setFunctionName(@Nullable String functionName) {
            this.functionName = Input.ofNullable(functionName);
            return this;
        }

        public Builder setHref(@Nullable Input<String> href) {
            this.href = href;
            return this;
        }

        public Builder setHref(@Nullable String href) {
            this.href = Input.ofNullable(href);
            return this;
        }

        public Builder setInvokeUrlTemplate(@Nullable Input<String> invokeUrlTemplate) {
            this.invokeUrlTemplate = invokeUrlTemplate;
            return this;
        }

        public Builder setInvokeUrlTemplate(@Nullable String invokeUrlTemplate) {
            this.invokeUrlTemplate = Input.ofNullable(invokeUrlTemplate);
            return this;
        }

        public Builder setIsDisabled(@Nullable Input<Boolean> isDisabled) {
            this.isDisabled = isDisabled;
            return this;
        }

        public Builder setIsDisabled(@Nullable Boolean isDisabled) {
            this.isDisabled = Input.ofNullable(isDisabled);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setLanguage(@Nullable Input<String> language) {
            this.language = language;
            return this;
        }

        public Builder setLanguage(@Nullable String language) {
            this.language = Input.ofNullable(language);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setScriptHref(@Nullable Input<String> scriptHref) {
            this.scriptHref = scriptHref;
            return this;
        }

        public Builder setScriptHref(@Nullable String scriptHref) {
            this.scriptHref = Input.ofNullable(scriptHref);
            return this;
        }

        public Builder setScriptRootPathHref(@Nullable Input<String> scriptRootPathHref) {
            this.scriptRootPathHref = scriptRootPathHref;
            return this;
        }

        public Builder setScriptRootPathHref(@Nullable String scriptRootPathHref) {
            this.scriptRootPathHref = Input.ofNullable(scriptRootPathHref);
            return this;
        }

        public Builder setSecretsFileHref(@Nullable Input<String> secretsFileHref) {
            this.secretsFileHref = secretsFileHref;
            return this;
        }

        public Builder setSecretsFileHref(@Nullable String secretsFileHref) {
            this.secretsFileHref = Input.ofNullable(secretsFileHref);
            return this;
        }

        public Builder setTestData(@Nullable Input<String> testData) {
            this.testData = testData;
            return this;
        }

        public Builder setTestData(@Nullable String testData) {
            this.testData = Input.ofNullable(testData);
            return this;
        }

        public Builder setTestDataHref(@Nullable Input<String> testDataHref) {
            this.testDataHref = testDataHref;
            return this;
        }

        public Builder setTestDataHref(@Nullable String testDataHref) {
            this.testDataHref = Input.ofNullable(testDataHref);
            return this;
        }

        public WebAppFunctionArgs build() {
            return new WebAppFunctionArgs(config, configHref, files, functionAppId, functionName, href, invokeUrlTemplate, isDisabled, kind, language, name, resourceGroupName, scriptHref, scriptRootPathHref, secretsFileHref, testData, testDataHref);
        }
    }
}
