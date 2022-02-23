// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DisplayDataResponse {
    /**
     * Contains value if the data is of a boolean type.
     * 
     */
    private final Boolean boolValue;
    /**
     * Contains value if the data is of duration type.
     * 
     */
    private final String durationValue;
    /**
     * Contains value if the data is of float type.
     * 
     */
    private final Double floatValue;
    /**
     * Contains value if the data is of int64 type.
     * 
     */
    private final String int64Value;
    /**
     * Contains value if the data is of java class type.
     * 
     */
    private final String javaClassValue;
    /**
     * The key identifying the display data. This is intended to be used as a label for the display data when viewed in a dax monitoring system.
     * 
     */
    private final String key;
    /**
     * An optional label to display in a dax UI for the element.
     * 
     */
    private final String label;
    /**
     * The namespace for the key. This is usually a class name or programming language namespace (i.e. python module) which defines the display data. This allows a dax monitoring system to specially handle the data and perform custom rendering.
     * 
     */
    private final String namespace;
    /**
     * A possible additional shorter value to display. For example a java_class_name_value of com.mypackage.MyDoFn will be stored with MyDoFn as the short_str_value and com.mypackage.MyDoFn as the java_class_name value. short_str_value can be displayed and java_class_name_value will be displayed as a tooltip.
     * 
     */
    private final String shortStrValue;
    /**
     * Contains value if the data is of string type.
     * 
     */
    private final String strValue;
    /**
     * Contains value if the data is of timestamp type.
     * 
     */
    private final String timestampValue;
    /**
     * An optional full URL.
     * 
     */
    private final String url;

    @OutputCustomType.Constructor({"boolValue","durationValue","floatValue","int64Value","javaClassValue","key","label","namespace","shortStrValue","strValue","timestampValue","url"})
    private DisplayDataResponse(
        Boolean boolValue,
        String durationValue,
        Double floatValue,
        String int64Value,
        String javaClassValue,
        String key,
        String label,
        String namespace,
        String shortStrValue,
        String strValue,
        String timestampValue,
        String url) {
        this.boolValue = Objects.requireNonNull(boolValue);
        this.durationValue = Objects.requireNonNull(durationValue);
        this.floatValue = Objects.requireNonNull(floatValue);
        this.int64Value = Objects.requireNonNull(int64Value);
        this.javaClassValue = Objects.requireNonNull(javaClassValue);
        this.key = Objects.requireNonNull(key);
        this.label = Objects.requireNonNull(label);
        this.namespace = Objects.requireNonNull(namespace);
        this.shortStrValue = Objects.requireNonNull(shortStrValue);
        this.strValue = Objects.requireNonNull(strValue);
        this.timestampValue = Objects.requireNonNull(timestampValue);
        this.url = Objects.requireNonNull(url);
    }

    /**
     * Contains value if the data is of a boolean type.
     * 
     */
    public Boolean getBoolValue() {
        return this.boolValue;
    }
    /**
     * Contains value if the data is of duration type.
     * 
     */
    public String getDurationValue() {
        return this.durationValue;
    }
    /**
     * Contains value if the data is of float type.
     * 
     */
    public Double getFloatValue() {
        return this.floatValue;
    }
    /**
     * Contains value if the data is of int64 type.
     * 
     */
    public String getInt64Value() {
        return this.int64Value;
    }
    /**
     * Contains value if the data is of java class type.
     * 
     */
    public String getJavaClassValue() {
        return this.javaClassValue;
    }
    /**
     * The key identifying the display data. This is intended to be used as a label for the display data when viewed in a dax monitoring system.
     * 
     */
    public String getKey() {
        return this.key;
    }
    /**
     * An optional label to display in a dax UI for the element.
     * 
     */
    public String getLabel() {
        return this.label;
    }
    /**
     * The namespace for the key. This is usually a class name or programming language namespace (i.e. python module) which defines the display data. This allows a dax monitoring system to specially handle the data and perform custom rendering.
     * 
     */
    public String getNamespace() {
        return this.namespace;
    }
    /**
     * A possible additional shorter value to display. For example a java_class_name_value of com.mypackage.MyDoFn will be stored with MyDoFn as the short_str_value and com.mypackage.MyDoFn as the java_class_name value. short_str_value can be displayed and java_class_name_value will be displayed as a tooltip.
     * 
     */
    public String getShortStrValue() {
        return this.shortStrValue;
    }
    /**
     * Contains value if the data is of string type.
     * 
     */
    public String getStrValue() {
        return this.strValue;
    }
    /**
     * Contains value if the data is of timestamp type.
     * 
     */
    public String getTimestampValue() {
        return this.timestampValue;
    }
    /**
     * An optional full URL.
     * 
     */
    public String getUrl() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DisplayDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean boolValue;
        private String durationValue;
        private Double floatValue;
        private String int64Value;
        private String javaClassValue;
        private String key;
        private String label;
        private String namespace;
        private String shortStrValue;
        private String strValue;
        private String timestampValue;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(DisplayDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boolValue = defaults.boolValue;
    	      this.durationValue = defaults.durationValue;
    	      this.floatValue = defaults.floatValue;
    	      this.int64Value = defaults.int64Value;
    	      this.javaClassValue = defaults.javaClassValue;
    	      this.key = defaults.key;
    	      this.label = defaults.label;
    	      this.namespace = defaults.namespace;
    	      this.shortStrValue = defaults.shortStrValue;
    	      this.strValue = defaults.strValue;
    	      this.timestampValue = defaults.timestampValue;
    	      this.url = defaults.url;
        }

        public Builder setBoolValue(Boolean boolValue) {
            this.boolValue = Objects.requireNonNull(boolValue);
            return this;
        }

        public Builder setDurationValue(String durationValue) {
            this.durationValue = Objects.requireNonNull(durationValue);
            return this;
        }

        public Builder setFloatValue(Double floatValue) {
            this.floatValue = Objects.requireNonNull(floatValue);
            return this;
        }

        public Builder setInt64Value(String int64Value) {
            this.int64Value = Objects.requireNonNull(int64Value);
            return this;
        }

        public Builder setJavaClassValue(String javaClassValue) {
            this.javaClassValue = Objects.requireNonNull(javaClassValue);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setLabel(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }

        public Builder setNamespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public Builder setShortStrValue(String shortStrValue) {
            this.shortStrValue = Objects.requireNonNull(shortStrValue);
            return this;
        }

        public Builder setStrValue(String strValue) {
            this.strValue = Objects.requireNonNull(strValue);
            return this;
        }

        public Builder setTimestampValue(String timestampValue) {
            this.timestampValue = Objects.requireNonNull(timestampValue);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public DisplayDataResponse build() {
            return new DisplayDataResponse(boolValue, durationValue, floatValue, int64Value, javaClassValue, key, label, namespace, shortStrValue, strValue, timestampValue, url);
        }
    }
}
