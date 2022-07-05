// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataproc.v1.inputs.ParameterValidationArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A configurable parameter that replaces one or more fields in the template. Parameterizable fields: - Labels - File uris - Job properties - Job arguments - Script variables - Main class (in HadoopJob and SparkJob) - Zone (in ClusterSelector)
 * 
 */
public final class TemplateParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final TemplateParameterArgs Empty = new TemplateParameterArgs();

    /**
     * Optional. Brief description of the parameter. Must not exceed 1024 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional. Brief description of the parameter. Must not exceed 1024 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Paths to all fields that the parameter replaces. A field is allowed to appear in at most one parameter&#39;s list of field paths.A field path is similar in syntax to a google.protobuf.FieldMask. For example, a field path that references the zone field of a workflow template&#39;s cluster selector would be specified as placement.clusterSelector.zone.Also, field paths can reference fields using the following syntax: Values in maps can be referenced by key: labels&#39;key&#39; placement.clusterSelector.clusterLabels&#39;key&#39; placement.managedCluster.labels&#39;key&#39; placement.clusterSelector.clusterLabels&#39;key&#39; jobs&#39;step-id&#39;.labels&#39;key&#39; Jobs in the jobs list can be referenced by step-id: jobs&#39;step-id&#39;.hadoopJob.mainJarFileUri jobs&#39;step-id&#39;.hiveJob.queryFileUri jobs&#39;step-id&#39;.pySparkJob.mainPythonFileUri jobs&#39;step-id&#39;.hadoopJob.jarFileUris0 jobs&#39;step-id&#39;.hadoopJob.archiveUris0 jobs&#39;step-id&#39;.hadoopJob.fileUris0 jobs&#39;step-id&#39;.pySparkJob.pythonFileUris0 Items in repeated fields can be referenced by a zero-based index: jobs&#39;step-id&#39;.sparkJob.args0 Other examples: jobs&#39;step-id&#39;.hadoopJob.properties&#39;key&#39; jobs&#39;step-id&#39;.hadoopJob.args0 jobs&#39;step-id&#39;.hiveJob.scriptVariables&#39;key&#39; jobs&#39;step-id&#39;.hadoopJob.mainJarFileUri placement.clusterSelector.zoneIt may not be possible to parameterize maps and repeated fields in their entirety since only individual map values and individual items in repeated fields can be referenced. For example, the following field paths are invalid: placement.clusterSelector.clusterLabels jobs&#39;step-id&#39;.sparkJob.args
     * 
     */
    @Import(name="fields", required=true)
    private Output<List<String>> fields;

    /**
     * @return Paths to all fields that the parameter replaces. A field is allowed to appear in at most one parameter&#39;s list of field paths.A field path is similar in syntax to a google.protobuf.FieldMask. For example, a field path that references the zone field of a workflow template&#39;s cluster selector would be specified as placement.clusterSelector.zone.Also, field paths can reference fields using the following syntax: Values in maps can be referenced by key: labels&#39;key&#39; placement.clusterSelector.clusterLabels&#39;key&#39; placement.managedCluster.labels&#39;key&#39; placement.clusterSelector.clusterLabels&#39;key&#39; jobs&#39;step-id&#39;.labels&#39;key&#39; Jobs in the jobs list can be referenced by step-id: jobs&#39;step-id&#39;.hadoopJob.mainJarFileUri jobs&#39;step-id&#39;.hiveJob.queryFileUri jobs&#39;step-id&#39;.pySparkJob.mainPythonFileUri jobs&#39;step-id&#39;.hadoopJob.jarFileUris0 jobs&#39;step-id&#39;.hadoopJob.archiveUris0 jobs&#39;step-id&#39;.hadoopJob.fileUris0 jobs&#39;step-id&#39;.pySparkJob.pythonFileUris0 Items in repeated fields can be referenced by a zero-based index: jobs&#39;step-id&#39;.sparkJob.args0 Other examples: jobs&#39;step-id&#39;.hadoopJob.properties&#39;key&#39; jobs&#39;step-id&#39;.hadoopJob.args0 jobs&#39;step-id&#39;.hiveJob.scriptVariables&#39;key&#39; jobs&#39;step-id&#39;.hadoopJob.mainJarFileUri placement.clusterSelector.zoneIt may not be possible to parameterize maps and repeated fields in their entirety since only individual map values and individual items in repeated fields can be referenced. For example, the following field paths are invalid: placement.clusterSelector.clusterLabels jobs&#39;step-id&#39;.sparkJob.args
     * 
     */
    public Output<List<String>> fields() {
        return this.fields;
    }

    /**
     * Parameter name. The parameter name is used as the key, and paired with the parameter value, which are passed to the template when the template is instantiated. The name must contain only capital letters (A-Z), numbers (0-9), and underscores (_), and must not start with a number. The maximum length is 40 characters.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Parameter name. The parameter name is used as the key, and paired with the parameter value, which are passed to the template when the template is instantiated. The name must contain only capital letters (A-Z), numbers (0-9), and underscores (_), and must not start with a number. The maximum length is 40 characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Optional. Validation rules to be applied to this parameter&#39;s value.
     * 
     */
    @Import(name="validation")
    private @Nullable Output<ParameterValidationArgs> validation;

    /**
     * @return Optional. Validation rules to be applied to this parameter&#39;s value.
     * 
     */
    public Optional<Output<ParameterValidationArgs>> validation() {
        return Optional.ofNullable(this.validation);
    }

    private TemplateParameterArgs() {}

    private TemplateParameterArgs(TemplateParameterArgs $) {
        this.description = $.description;
        this.fields = $.fields;
        this.name = $.name;
        this.validation = $.validation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TemplateParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TemplateParameterArgs $;

        public Builder() {
            $ = new TemplateParameterArgs();
        }

        public Builder(TemplateParameterArgs defaults) {
            $ = new TemplateParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Optional. Brief description of the parameter. Must not exceed 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional. Brief description of the parameter. Must not exceed 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param fields Paths to all fields that the parameter replaces. A field is allowed to appear in at most one parameter&#39;s list of field paths.A field path is similar in syntax to a google.protobuf.FieldMask. For example, a field path that references the zone field of a workflow template&#39;s cluster selector would be specified as placement.clusterSelector.zone.Also, field paths can reference fields using the following syntax: Values in maps can be referenced by key: labels&#39;key&#39; placement.clusterSelector.clusterLabels&#39;key&#39; placement.managedCluster.labels&#39;key&#39; placement.clusterSelector.clusterLabels&#39;key&#39; jobs&#39;step-id&#39;.labels&#39;key&#39; Jobs in the jobs list can be referenced by step-id: jobs&#39;step-id&#39;.hadoopJob.mainJarFileUri jobs&#39;step-id&#39;.hiveJob.queryFileUri jobs&#39;step-id&#39;.pySparkJob.mainPythonFileUri jobs&#39;step-id&#39;.hadoopJob.jarFileUris0 jobs&#39;step-id&#39;.hadoopJob.archiveUris0 jobs&#39;step-id&#39;.hadoopJob.fileUris0 jobs&#39;step-id&#39;.pySparkJob.pythonFileUris0 Items in repeated fields can be referenced by a zero-based index: jobs&#39;step-id&#39;.sparkJob.args0 Other examples: jobs&#39;step-id&#39;.hadoopJob.properties&#39;key&#39; jobs&#39;step-id&#39;.hadoopJob.args0 jobs&#39;step-id&#39;.hiveJob.scriptVariables&#39;key&#39; jobs&#39;step-id&#39;.hadoopJob.mainJarFileUri placement.clusterSelector.zoneIt may not be possible to parameterize maps and repeated fields in their entirety since only individual map values and individual items in repeated fields can be referenced. For example, the following field paths are invalid: placement.clusterSelector.clusterLabels jobs&#39;step-id&#39;.sparkJob.args
         * 
         * @return builder
         * 
         */
        public Builder fields(Output<List<String>> fields) {
            $.fields = fields;
            return this;
        }

        /**
         * @param fields Paths to all fields that the parameter replaces. A field is allowed to appear in at most one parameter&#39;s list of field paths.A field path is similar in syntax to a google.protobuf.FieldMask. For example, a field path that references the zone field of a workflow template&#39;s cluster selector would be specified as placement.clusterSelector.zone.Also, field paths can reference fields using the following syntax: Values in maps can be referenced by key: labels&#39;key&#39; placement.clusterSelector.clusterLabels&#39;key&#39; placement.managedCluster.labels&#39;key&#39; placement.clusterSelector.clusterLabels&#39;key&#39; jobs&#39;step-id&#39;.labels&#39;key&#39; Jobs in the jobs list can be referenced by step-id: jobs&#39;step-id&#39;.hadoopJob.mainJarFileUri jobs&#39;step-id&#39;.hiveJob.queryFileUri jobs&#39;step-id&#39;.pySparkJob.mainPythonFileUri jobs&#39;step-id&#39;.hadoopJob.jarFileUris0 jobs&#39;step-id&#39;.hadoopJob.archiveUris0 jobs&#39;step-id&#39;.hadoopJob.fileUris0 jobs&#39;step-id&#39;.pySparkJob.pythonFileUris0 Items in repeated fields can be referenced by a zero-based index: jobs&#39;step-id&#39;.sparkJob.args0 Other examples: jobs&#39;step-id&#39;.hadoopJob.properties&#39;key&#39; jobs&#39;step-id&#39;.hadoopJob.args0 jobs&#39;step-id&#39;.hiveJob.scriptVariables&#39;key&#39; jobs&#39;step-id&#39;.hadoopJob.mainJarFileUri placement.clusterSelector.zoneIt may not be possible to parameterize maps and repeated fields in their entirety since only individual map values and individual items in repeated fields can be referenced. For example, the following field paths are invalid: placement.clusterSelector.clusterLabels jobs&#39;step-id&#39;.sparkJob.args
         * 
         * @return builder
         * 
         */
        public Builder fields(List<String> fields) {
            return fields(Output.of(fields));
        }

        /**
         * @param fields Paths to all fields that the parameter replaces. A field is allowed to appear in at most one parameter&#39;s list of field paths.A field path is similar in syntax to a google.protobuf.FieldMask. For example, a field path that references the zone field of a workflow template&#39;s cluster selector would be specified as placement.clusterSelector.zone.Also, field paths can reference fields using the following syntax: Values in maps can be referenced by key: labels&#39;key&#39; placement.clusterSelector.clusterLabels&#39;key&#39; placement.managedCluster.labels&#39;key&#39; placement.clusterSelector.clusterLabels&#39;key&#39; jobs&#39;step-id&#39;.labels&#39;key&#39; Jobs in the jobs list can be referenced by step-id: jobs&#39;step-id&#39;.hadoopJob.mainJarFileUri jobs&#39;step-id&#39;.hiveJob.queryFileUri jobs&#39;step-id&#39;.pySparkJob.mainPythonFileUri jobs&#39;step-id&#39;.hadoopJob.jarFileUris0 jobs&#39;step-id&#39;.hadoopJob.archiveUris0 jobs&#39;step-id&#39;.hadoopJob.fileUris0 jobs&#39;step-id&#39;.pySparkJob.pythonFileUris0 Items in repeated fields can be referenced by a zero-based index: jobs&#39;step-id&#39;.sparkJob.args0 Other examples: jobs&#39;step-id&#39;.hadoopJob.properties&#39;key&#39; jobs&#39;step-id&#39;.hadoopJob.args0 jobs&#39;step-id&#39;.hiveJob.scriptVariables&#39;key&#39; jobs&#39;step-id&#39;.hadoopJob.mainJarFileUri placement.clusterSelector.zoneIt may not be possible to parameterize maps and repeated fields in their entirety since only individual map values and individual items in repeated fields can be referenced. For example, the following field paths are invalid: placement.clusterSelector.clusterLabels jobs&#39;step-id&#39;.sparkJob.args
         * 
         * @return builder
         * 
         */
        public Builder fields(String... fields) {
            return fields(List.of(fields));
        }

        /**
         * @param name Parameter name. The parameter name is used as the key, and paired with the parameter value, which are passed to the template when the template is instantiated. The name must contain only capital letters (A-Z), numbers (0-9), and underscores (_), and must not start with a number. The maximum length is 40 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Parameter name. The parameter name is used as the key, and paired with the parameter value, which are passed to the template when the template is instantiated. The name must contain only capital letters (A-Z), numbers (0-9), and underscores (_), and must not start with a number. The maximum length is 40 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param validation Optional. Validation rules to be applied to this parameter&#39;s value.
         * 
         * @return builder
         * 
         */
        public Builder validation(@Nullable Output<ParameterValidationArgs> validation) {
            $.validation = validation;
            return this;
        }

        /**
         * @param validation Optional. Validation rules to be applied to this parameter&#39;s value.
         * 
         * @return builder
         * 
         */
        public Builder validation(ParameterValidationArgs validation) {
            return validation(Output.of(validation));
        }

        public TemplateParameterArgs build() {
            $.fields = Objects.requireNonNull($.fields, "expected parameter 'fields' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
